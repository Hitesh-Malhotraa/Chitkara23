package Lec8;
import java.util.Scanner;
public class AnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int cb=scn.nextInt();
int eb=scn.nextInt();
int value=scn.nextInt();
//yeh jo convert h b to d ,d to b,d to o,o to d;
if(cb==2&&eb==8)
{
	//binary se octal
//	case 1:binary se decimal me jaao
	
	int res=convert(value,cb,10);  
	int ans=convert(res,10,8);
System.out.println(ans);
}
else if(cb==8&&eb==2)
{
//	octal se binary
	int res=convert(value,cb,10);
	int ans=convert(res,10,eb);
	System.out.println(ans);
}
else {
int ans=convert(value,cb,eb);
System.out.println(ans);	
}
	}
	public static int convert(int value,int cb,int eb)
	{
		int sum=0;
		int multi=1;
		int n=value;
		while(n>0)
		{
			int rem=n%eb;
			sum=sum+rem*multi;
			multi=multi*cb;
			n=n/eb;
		}
		return sum;
	}
}