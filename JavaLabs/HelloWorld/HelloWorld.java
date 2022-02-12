// Lab 3

public class HelloWorld
{
    public static void main(String[] args)
    {
        int NHeight = 71;
        int NAge = 19;
        
        if(NHeight > 12 && NAge > 12)
            System.out.println("Noah is 71 inches and 19 years old");
        else if(NHeight < 12 || NAge < 12)
            System.out.println("Noah is cool");
        else 
            System.out.println("Hello World!");
    }
} 