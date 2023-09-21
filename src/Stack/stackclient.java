package Stack;
import java.util.Scanner;
public class stackclient {

	static {
		Scanner scn=new Scanner(System.in);
		int v1=scn.nextInt();
		int v2=scn.nextInt();
		int ans=sum(v1,v2);
	System.out.println(ans);	
	}
	
public static void main(String args[])
{
	
StackDemo.fun1();
StackDemo sd=new StackDemo();
System.out.println("main k baad");

}
public static int sum(int a,int b)
{
	return a+b;
}


}

