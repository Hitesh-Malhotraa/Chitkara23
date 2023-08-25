package lec21;
import java.util.Scanner;
public class Playingwithgudstring {

	public static void main(String args[]) {
        // Your Code Here
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
    System.out.println(sol(str));
    }
    public static int sol(String str)
    {
        int max=0;
        int i=0;
        int cnt=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            if(isVowel(ch))
            {
               cnt+=1;
            }
            else{
                max=Math.max(cnt,max);
                cnt=0;
            }
            i++;
        }
        max=Math.max(cnt,max);
        return max;
    }
    public static boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}



