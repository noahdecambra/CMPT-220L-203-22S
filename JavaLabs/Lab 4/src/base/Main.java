package base;
import static java.lang.Math.*;
public class Main {
    /**
     # Lab 4
     
     Goals are:
     - Switch Case
     - Looping
     - Making our own functions
     - Combining functions
     - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String drinks = "Water";
        switch (drinks){
            case "soda":
                System.out.println("pepsi");
                break;
            case "juice":
                System.out.println("Apple Juice");
                break;
            case "Milkshake":
                System.out.println("Vanilla");
                break;
            case "lean":
                System.out.println("codine, sprite, and jolly ranchers");
                break;

        }
        // Give me an example of you using a for loop
        for (int i = 1; i < 25; i++){
            System.out.println(5 * i);
        }
        // Give me an example of you using a while loop
        int counter = 0 ;
        while (counter <= 5){
            System.out.println("Counter: " + counter);
            counter++;
        }
        //first function
        int resutl = powerednumber(8,4);
        System.out.println(resutl);
        //second function
        int[] y = new int[]{0,2,4,6,2,2};
        System.out.println(listreader(2,y));
        //third fuction
        System.out.println(sumarr(y));
        //fourth function
        System.out.println(pytheory(3,4));
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     I want you to write a function that will take in a number and raise it to the power given.
     For example if given the numbers 2 and 3. The math that the function should do is 2^3
     and should print out or return 8. Print the output.
     */
   static int powerednumber (int num1 , int num2) {
        return num1^num2;
    }
    /**
     I want you to write a function that will take in a list and see how many times a given number is in the list.
     For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     or return 3. Print the output.
     */
   static int readList (int num, int[] list ){

       int x = 0;
       for (int i = 0; i < list.length; i++){
           if (list[i] == num){
               x++;
           }
       }

       return x;
   }
    /**
     Create a function named summation that will take in an int[ ] and return an int.
     I want the function to then go through the given array and sum up digits in the array.
     Once that’s done print or return the answer. Print the output
     */
    static int sumarr (int[] list2 ){
        int z = 0 ;
        for (int i = 0; i <list2.length; i++){
            z =  z + list2[i];
        }
        return z;
    }
    /**
     Give me a function that gives the answer to the pythagorean theorem.
     I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     Given a and b as parameters i'd like you to return c.
     If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     Once that’s done print or return the answer. Print the output
     */


    static double pytheory (int a , int b){
        double c = Math.sqrt(powerednumber(a,2) + powerednumber(b,2));
        return c;
    }
}
