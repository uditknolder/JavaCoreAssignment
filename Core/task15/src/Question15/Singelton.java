package Question15;


public class Singelton
{
    private static Singelton obj = new Singelton();
    public String string;

    //Creating private constructor
    private Singelton()
    {
        string = "Welcome to Knoldus";
    }

    public static Singelton getInstance()
    {
        return obj;
    }


}