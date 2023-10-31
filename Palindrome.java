import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int temp=num,a=0;
    while(num>0){
      a=a*10+(num%10);
      num/=10;
    }
    if(a==temp){
      System.out.println(Palindrome");
    }
    else{
      System.out.println(Not Palindrome");
    }
  }
}
