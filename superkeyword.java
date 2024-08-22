//visit https://www.javatpoint.com/super-keyword

class employee{
  private long salary;
  public employee(long salary){
    this.salary = salary;
  }
  public long getSalary() {
    return salary;
  }
}

class hr extends employee{
  
  public hr(long salary){
    super(salary);
  }

  public long showsalary(){
    return super.getSalary();
  }
}

public class superkeyword{
  public static void main(String[] args){
    hr newhr = new hr(80000);
    System.out.println(newhr.showsalary());
  }
}
