
package dhbw.wwi.vertsys.javaee.jtodo.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dhbw.wwi.vertsys.javaee.jtodo.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMovie_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "deleteMovie");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "deleteMovieResponse");
    private final static QName _FindMovies_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "findMovies");
    private final static QName _FindMoviesResponse_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "findMoviesResponse");
    private final static QName _SaveNewMovie_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "saveNewMovie");
    private final static QName _SaveNewMovieResponse_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "saveNewMovieResponse");
    private final static QName _UpdateExistingMovie_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "updateExistingMovie");
    private final static QName _UpdateExistingMovieResponse_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "updateExistingMovieResponse");
    private final static QName _InvalidCredentialsException_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "InvalidCredentialsException");
    private final static QName _Username_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "username");
    private final static QName _Password_QNAME = new QName("http://soap.jtodo.javaee.vertsys.wwi.dhbw/", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dhbw.wwi.vertsys.javaee.jtodo.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link FindMovies }
     * 
     */
    public FindMovies createFindMovies() {
        return new FindMovies();
    }

    /**
     * Create an instance of {@link FindMoviesResponse }
     * 
     */
    public FindMoviesResponse createFindMoviesResponse() {
        return new FindMoviesResponse();
    }

    /**
     * Create an instance of {@link SaveNewMovie }
     * 
     */
    public SaveNewMovie createSaveNewMovie() {
        return new SaveNewMovie();
    }

    /**
     * Create an instance of {@link SaveNewMovieResponse }
     * 
     */
    public SaveNewMovieResponse createSaveNewMovieResponse() {
        return new SaveNewMovieResponse();
    }

    /**
     * Create an instance of {@link UpdateExistingMovie }
     * 
     */
    public UpdateExistingMovie createUpdateExistingMovie() {
        return new UpdateExistingMovie();
    }

    /**
     * Create an instance of {@link UpdateExistingMovieResponse }
     * 
     */
    public UpdateExistingMovieResponse createUpdateExistingMovieResponse() {
        return new UpdateExistingMovieResponse();
    }

    /**
     * Create an instance of {@link InvalidCredentialsException }
     * 
     */
    public InvalidCredentialsException createInvalidCredentialsException() {
        return new InvalidCredentialsException();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovies }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindMovies }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "findMovies")
    public JAXBElement<FindMovies> createFindMovies(FindMovies value) {
        return new JAXBElement<FindMovies>(_FindMovies_QNAME, FindMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMoviesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindMoviesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "findMoviesResponse")
    public JAXBElement<FindMoviesResponse> createFindMoviesResponse(FindMoviesResponse value) {
        return new JAXBElement<FindMoviesResponse>(_FindMoviesResponse_QNAME, FindMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveNewMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "saveNewMovie")
    public JAXBElement<SaveNewMovie> createSaveNewMovie(SaveNewMovie value) {
        return new JAXBElement<SaveNewMovie>(_SaveNewMovie_QNAME, SaveNewMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveNewMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveNewMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "saveNewMovieResponse")
    public JAXBElement<SaveNewMovieResponse> createSaveNewMovieResponse(SaveNewMovieResponse value) {
        return new JAXBElement<SaveNewMovieResponse>(_SaveNewMovieResponse_QNAME, SaveNewMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExistingMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateExistingMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "updateExistingMovie")
    public JAXBElement<UpdateExistingMovie> createUpdateExistingMovie(UpdateExistingMovie value) {
        return new JAXBElement<UpdateExistingMovie>(_UpdateExistingMovie_QNAME, UpdateExistingMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateExistingMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateExistingMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "updateExistingMovieResponse")
    public JAXBElement<UpdateExistingMovieResponse> createUpdateExistingMovieResponse(UpdateExistingMovieResponse value) {
        return new JAXBElement<UpdateExistingMovieResponse>(_UpdateExistingMovieResponse_QNAME, UpdateExistingMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "InvalidCredentialsException")
    public JAXBElement<InvalidCredentialsException> createInvalidCredentialsException(InvalidCredentialsException value) {
        return new JAXBElement<InvalidCredentialsException>(_InvalidCredentialsException_QNAME, InvalidCredentialsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.jtodo.javaee.vertsys.wwi.dhbw/", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}
