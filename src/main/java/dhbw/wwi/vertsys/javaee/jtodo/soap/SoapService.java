/*
 * Copyright © 2019 Markus Scheuring, Kai Schmid, Tobias Frietsch
 * 
 * E-Mail: dhbw@windows3.de
 * Webseite: https://www.wpvs.de/
 * 
 * Dieser Quellcode ist lizenziert unter einer
 * Creative Commons Namensnennung 4.0 International Lizenz.
 */
package dhbw.wwi.vertsys.javaee.jtodo.soap;

import dhbwka.wwi.vertsys.javaee.jtodo.common.ejb.UserBean;
import dhbwka.wwi.vertsys.javaee.jtodo.tasks.ejb.MovieBean;
import dhbwka.wwi.vertsys.javaee.jtodo.tasks.jpa.Movie;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Stateless
public class SoapService {
    
   @EJB MovieBean movieBean;
   @EJB UserBean userBean;
 
   @WebMethod
   @WebResult(name = "movies")
   public List<Movie> findMovies(
           @WebParam(name="username") String username,
           @WebParam(name="password") String password
   ) throws UserBean.InvalidCredentialsException
   {     
       this.userBean.validateUser(username, password);
       return movieBean.findAll();
   }
   
    @WebMethod
    @WebResult(name = "movie")
    public Movie saveNewMovie(
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password,
            @WebParam(name = "movie") Movie movie
    ) throws UserBean.InvalidCredentialsException {
        
        userBean.validateUser(username, password);       
       
        return this.movieBean.saveNew(movie);
    }
    
    @WebMethod
    @WebResult(name = "movie")
    public Movie updateExistingMovie(
            @WebParam(name = "username", header = true) String username,
            @WebParam(name = "password", header = true) String password,
            @WebParam(name = "movie") Movie movie
    ) throws UserBean.InvalidCredentialsException {
       
        userBean.validateUser(username, password);
        
        
        return this.movieBean.update(movie);
    }

    @WebMethod
    public void deleteMovie(
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password,
            @WebParam(name = "movie") Movie movie
    ) throws UserBean.InvalidCredentialsException{

        userBean.validateUser(username, password);

        this.movieBean.delete(movie);
    }
   
   
}