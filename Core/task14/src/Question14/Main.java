package Question14;
public class Main {

    private static final String uditknolder="main.java.utils";
    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(uditknolder);
            System.out.println("Class " + loadedClass + " found successfully!");
        }
        catch (ClassNotFoundException ex) {
            System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
