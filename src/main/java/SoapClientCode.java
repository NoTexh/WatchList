/*
package dhbw.wwi.vertsys.soap_client;

import dhbw.wwi.vertsys.javaee.jtodo.soap.InvalidCredentialsException_Exception;
import dhbw.wwi.vertsys.javaee.jtodo.soap.Movie;
import dhbw.wwi.vertsys.javaee.jtodo.soap.SoapService;
import dhbw.wwi.vertsys.javaee.jtodo.soap.SoapServiceService;
import java.util.List;


public class SoapClient {

    public static void main(String[] args) throws InvalidCredentialsException_Exception {
        // Stub-Objekt zum entfernten Aufruf erstellen
        SoapServiceService service = new SoapServiceService();
        SoapService movieWs = service.getSoapServicePort();
        String user = "sasas";
        String pw = "123456";
        // Webservice-Operation "findAll" aufrufen
        List<Movie> allMovies;
        
        allMovies = movieWs.findMovies(user, pw);
       
        // Abgerufenes Ergebnis anzeigen
        System.out.println("========================");
        System.out.println(user+"s SOAP-WatchList");
        System.out.println("========================");
        System.out.println();

        for (Movie movie : allMovies) {
            System.out.println("Name:         " + movie.getMovieTitle());
            System.out.println("Beschreibung: " + movie.getMovieDescripton());
            System.out.println("Erstellt am:         " + movie.getCreationDate());
            System.out.println("Kategorie:         " + movie.getCategory());
            System.out.println("Status:         " + movie.getMovieStatus());
            System.out.println();
        }
    }
}
*/

