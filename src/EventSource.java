import java.io.BufferedReader;
import java.util.Observable;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable {
    public void run() {
        
        try {
            while (true){
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                this.setChanged();
                notifyObservers(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
