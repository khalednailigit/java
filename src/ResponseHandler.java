import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
    private String resp;
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
        }
        System.out.println("ResponseHandler: " + resp);
    }
    
}
