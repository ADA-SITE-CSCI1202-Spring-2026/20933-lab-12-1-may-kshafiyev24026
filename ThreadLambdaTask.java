public class ThreadLambdaTask {
    public static void main(String[] args) {

        // ===== TODO 1 =====
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }
        });

        // ===== TODO 2 =====
        thread.start();

        System.out.println("Main method finished.");
    }
}
