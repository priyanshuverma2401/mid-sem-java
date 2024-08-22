/*
 * Scanner class is one of the simplest ways to read userinput in java.
 * it can read input from various source like System.in(Keyboard input), files, String etc.
 * Scanner class provides various types of method to read different type of data such as integer, float, double, String.
 * methods:-
 * nextLine(): Reads an entire line of text
 * nextInt(), nextFloat(), nextdouble() reads the data of specific type
 
 * 
 */

import java.util.Scanner;

public class scanner {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your Age: ");
    double age = sc.nextDouble();

    System.out.println("Your Name: " + name);
    System.out.println("Your Age: " + age);

  }
}
