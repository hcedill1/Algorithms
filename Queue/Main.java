public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(100);
        queue.insert(1000);
        queue.insert(14);
        queue.insert(69);

        queue.view();
    }
}
