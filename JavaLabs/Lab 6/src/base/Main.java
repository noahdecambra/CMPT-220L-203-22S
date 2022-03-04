package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.net.ssl.SSLParameters;

public class Main 
{
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) 
    {
        // Create an Array, Populate it, and Print it out
        problem1();
        // Create an ArrayList, Populate it, and Print it out
        problem2();
        // Create an LinkedList, Populate it, and Print it out
        problem3();
        // Create an Queue, Populate it, and Print it out
        problem4();
        // Create an Stack, Populate it, and Print it out
        problem5();
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        plants spider = new plants(true,"lily","spider");
        System.out.println(spider.name);
    }


    public static void problem1()
    {
        int band = 4 ;
        int[] pizza1 = {1,2,3,4,5};
        while (band >= 0)
        {
            System.out.println("pizza left " + pizza1[band]);
            band--;
        }
    }


    public static void problem2()
    {
        ArrayList<Integer> pizza2 = new ArrayList<Integer>();
        for (int i = 0; i < pizza2.size(); i++) 
        {
            System.out.println("pizza counter" + pizza2.get(i));
        }

        pizza2.add(1);
        pizza2.add(2);
        pizza2.add(3);
        pizza2.add(4);
        pizza2.add(5);

        for (int i = 0; i < pizza2.size(); i++)
        {
            System.out.println("pizza counter" + pizza2.get(i));
        }
    }


    public static void problem3()
    {
        LinkedList<String> routine = new LinkedList<String>();

        routine.add("wake up");
        routine.add("eat");
        routine.add("go to class");
        routine.add("exercice");
        routine.add("eat");
        routine.add("play video games");
        routine.add("sleep");
    
        System.out.println(routine);

        routine.add(2, "brush teeth");
        routine.add(5, "shower");

        System.out.println(routine);
    }
    

    public static void problem4()
    {
        Queue<String> music = new LinkedList<String>();

        music.add("Group B by Tyler the Creator");
        music.add("DNA. by Kendrick Lamara");
        music.add("Fat Mac by Duke Deuce");
        music.add("castles by Lil Peep & Lil Tracy");

        System.out.println(music);

        String headOfqueue = music.remove();

        System.out.println(music);

        System.out.println(headOfqueue);

        System.out.println(music.element());

        System.out.println(music);
    }


    public static void problem5()
    {
        Stack<String> attack = new Stack<String>();

        attack.push("Upper Cut");
        attack.push("Right Hook");
        attack.push("Left Jab");
        attack.push("Superman Punch");
        attack.push("Spinning Kick");
        attack.push("Leg Check");
    
        System.out.println(attack);

        attack.pop();
        attack.pop();

        System.out.println("Attacks left"+ attack);
    }
}