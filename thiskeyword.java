//visit https://www.javatpoint.com/this-keyword

class ractangle{
  private long length;
  private long width;

  public ractangle(long length, long width){
    this.length = length;
    this.width = width;
  }
  public ractangle(){
    this(1, 1);
  }

  public void printarea(){
    System.out.println("the area of a rectangle is: " + (this.length *this.width));
  }
}

public class thiskeyword {
  public static void main(String[] args) {
    ractangle r1 = new ractangle(20, 40);
    r1.printarea();

    ractangle r2 = new ractangle();
    r2.printarea();
  }
}
