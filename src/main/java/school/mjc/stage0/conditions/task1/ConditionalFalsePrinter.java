package school.mjc.stage0.conditions.task1;

public class ConditionalFalsePrinter {
    public static void main(String[] args) {
        if(false) {
            System.out.println("This will never be printed");
        } else {
            System.out.println(false);
        }
    }
}
