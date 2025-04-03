package level1;
public class NullPointer {
    public static void generate() {
        String text = null;
        System.out.println(text.length());
    }
    public static void handle() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
       // generate();
        handle();
    }
}

