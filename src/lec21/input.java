package lec21;
import java.util.*;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>list=new ArrayList();
Scanner scn=new Scanner(System.in);
while(scn.hasNextInt()==true)
{
	list.add(scn.nextInt());
}
System.out.println(list);
	}

}
