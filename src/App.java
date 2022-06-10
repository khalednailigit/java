public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("enter text");
        EventSource eventSource = new EventSource();
        ResponseHandler responseHandler = new ResponseHandler();
        eventSource.addObserver(responseHandler);
        eventSource.run();
    }
}
