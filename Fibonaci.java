import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int num1=0,num2=1,num3;
    System.out.print(num1+" "+num2+" ");
    while(num>2){
        num3=num1+num2;
        num1=num2;
        num2=num3;
        System.out.print(num3+" ");
        num--;
    }
  }
}
