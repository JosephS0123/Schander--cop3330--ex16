package org.example;



import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner uInput = new Scanner(System.in);
        System.out.println( "What is your age?" );
        int age = uInput.nextInt();
       String Tern =((age>=16) ? ( "are" ):( "are not" ));
       System.out.println("You " + Tern +" old enough to legally drive");
    }
}
