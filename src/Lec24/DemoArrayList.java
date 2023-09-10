package Lec24;
import java.util.ArrayList;
public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
al.add(50);
int i=0;
int j=al.size()-1;
while(i<j)
{
	int temp=al.get(i);
	int val2=al.get(j);
	al.add(i,val2);
	al.add(j,temp);
	i++;
	j--;
}
al.set(1, 100);
System.out.print(al);

	}

}
