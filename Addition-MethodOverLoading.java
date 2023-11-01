import java.util.*;
class Addition{
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
public class Main
{
	public static void main(String[] args) {
		Addition a=new Addition();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
		    arr[i]=sc.nextInt();
		}
		if(num==2){
		    a.add(arr[0],arr[1]);
		}
		else if(num==3){
		    a.add(arr[0],arr[1],arr[2]);
		}
		else{
		    a.add(arr);
		}
	}
}
