import java.util.*;
class Shape{
    public void color(String s){
        System.out.println("Red");
    }
}
class Triangle extends Shape{
    public void area(double base,double height){
        System.out.println(0.5*base*height);
    }
}
public class SingleInheritence
{
	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Triangle t=new Triangle();
		String s=sc.next();
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		t.color(s);
		t.area(base,height);
	}
}
