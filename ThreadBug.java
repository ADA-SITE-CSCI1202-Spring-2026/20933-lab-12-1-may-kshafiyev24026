public class ThreadBug {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Running in another thread");
        });

        // ===== FIX =====
        t.start(); //changed to start

        System.out.println("Main finished");
    }
}
