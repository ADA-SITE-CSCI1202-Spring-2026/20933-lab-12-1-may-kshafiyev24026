
interface NumberChecker {
    boolean check(int number);

    

    default void printResult() {
        System.out.println("Check complete.");
    }
}

public class LambdaFixTask {
    public static void main(String[] args) {
        NumberChecker isEven = number -> number % 2 == 0;
        System.out.println(isEven.check(10)); 
        isEven.printResult();                  
    }
}
