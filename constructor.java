// visit https://www.javatpoint.com/java-constructor


class rectangle{
  private int length;
  private int width;

  public rectangle(int length, int width){ //paramaterized constructor
    this.length = length;
    this.width = width;
  }

  public rectangle(){ //default constructor
    this.length = 1;
    this.width = 1;
  }

  public rectangle(rectangle r){
    this.length = r.length;
    this.width = r.width;
  }

  void printarea(){
    System.out.println("the area of a rectangle is: "+ (this.length*this.width));
  }
}


public class constructor {
  public static void main(String args[]){
    rectangle r1 = new rectangle();
    r1.printarea();

    rectangle r2 = new rectangle(56, 78);
    r2.printarea();

    rectangle r3 = new rectangle(r2);
    r3.printarea();
  }
}
