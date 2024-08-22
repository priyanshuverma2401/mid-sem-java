// visit https://www.javatpoint.com/method-overloading-vs-method-overriding-in-java

class rectangle{
  private double length;
  final static double pi = 3.14;
  private double width;

  public rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  double getarea(){
    return this.length*this.width;
  }
}

class circle extends rectangle{
  private double r;
  public circle(double r){
    super(0,0);
    this.r = r;
  }
  double getarea(){
    return pi*(this.r*this.r);
  }
}

public class methodoveriding {
  public static void main(String[] args){
    circle c1 = new circle(5);
    System.out.println(c1.getarea());
  }
}
