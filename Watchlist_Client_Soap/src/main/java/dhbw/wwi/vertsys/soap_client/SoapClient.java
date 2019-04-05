/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi.vertsys.soap_client;

import dhbw.wwi.vertsys.javaee.jtodo.soap.InvalidCredentialsException_Exception;
import dhbw.wwi.vertsys.javaee.jtodo.soap.Movie;
import dhbw.wwi.vertsys.javaee.jtodo.soap.SoapService;
import dhbw.wwi.vertsys.javaee.jtodo.soap.SoapServiceService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SoapClient {

    public static void main(String[] args) throws InvalidCredentialsException_Exception, IOException {
        
        SoapServiceService service = new SoapServiceService();
        SoapService movieWs = service.getSoapServicePort();
        String user, pw;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Nutzername eingeben: ");
        user = br.readLine();
        System.out.print("Passwort: ");
        pw = br.readLine();
       
        List<Movie> allMovies;
        List<Movie> userMovies;
        Movie idMovie;

       
        System.out.println("========================");
        System.out.println(user + "s SOAP-WatchList");
        System.out.println("========================");
        System.out.println();

        allMovies = movieWs.findMovies(user, pw);

        for (Movie movie : allMovies) {
            System.out.println("Name:         " + movie.getMovieTitle());
            System.out.println("Beschreibung: " + movie.getMovieDescription());
            System.out.println("Erstellt am:         " + movie.getCreationDate());
            System.out.println("Kategorie:         " + movie.getCategory());
            System.out.println("Status:         " + movie.getMovieStatus());
            System.out.println();
        }
        
        System.out.println("========================");
        System.out.println();
        
        
        System.out.println("Suchen nach Film-ID");
        System.out.print("Zu suchende Film-ID: ");
        String suchId = br.readLine();
        long id = Long.parseLong(suchId);

        idMovie = movieWs.findMovieById(user, pw, id);
        System.out.println("Film mit der ID "+suchId);
        System.out.println("Name:         " + idMovie.getMovieTitle());
        System.out.println("Beschreibung: " + idMovie.getMovieDescription());
        System.out.println("Status:         " + idMovie.getMovieStatus());
        
        System.out.println("========================");
        System.out.println();
        
        System.out.println("Filme eines Users anzeigen");
        System.out.print("Zu suchender User: ");
        String suchUser = br.readLine();

        userMovies = movieWs.findMoviesByUser(user, pw, suchUser);

        System.out.println("===========" + suchUser + "===========");
        System.out.println();

        for (Movie usermovie : userMovies) {
            System.out.println("Name:         " + usermovie.getMovieTitle());
            System.out.println("Beschreibung: " + usermovie.getMovieDescription());
            System.out.println("Status:         " + usermovie.getMovieStatus());
            System.out.println();
        }
    }
}
