//visit https://www.javatpoint.com/method-overloading-vs-method-overriding-in-java


public class methodoverloading {
  static int sum(int x, int y){
    return x + y;
  }
  static int sum(int x, int y, int z){
    return x + y + z;
  }
  public static void main(String[] args){
    System.out.println(sum(2, 4));
    System.out.println(sum(3, 4, 5));
  }
}
