package zm.unza.msc.csc5231.ecommerce.utils.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: david
 * Date: 14/08/2019
 * Time: 1:19 PM
 **/
public class SecurityBreachException extends Exception {
    private static final long serialVersionUID = -1232121594261703341L;

    public SecurityBreachException() {
        super("Security Exception");
    }

    public SecurityBreachException(String message){
        super(message);
    }
}
