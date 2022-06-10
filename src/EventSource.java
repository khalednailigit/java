import java.io.BufferedReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    public void run() {
        
        try {
            final BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            while (true){
                // read a line of text with scanner
                

                final String response  = br.readLine();
                this.setChanged();
                notifyObservers(response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
