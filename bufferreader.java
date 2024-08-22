/*
 * The BufferedReader class is a part of the java.io package
 * and provides more efficient way to read input, specially when handling large amount of data.
 * methods:-
 * readLine() : Reads a full line of text as a String.
 * read() : Reads a single character or an array of character
 * 
 * best suitable for file reading
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferreader {
  public static void main(String[] args) throws Exception{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name: ");

    String name = reader.readLine();

    System.out.println("Enter your age: ");
    String ageinpt = reader.readLine();

    int age = Integer.parseInt(ageinpt);

    System.out.println("Your name is: " + name);
    System.out.println("Your age is: " + age);
  }
}
