package Lec6;
import java.util.*;
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int nsp = 4;
        int nst = 1;
        while (row<2*n) {
                for (int cst = 0; cst < nsp; cst++) {
                    System.out.print(" ");
                }
                for (int cst = 0; cst < nst; cst++) {
                    System.out.print("*");
                }
                row++;
                if(row<n){
                    System.out.println();
                    nst += 1;
                    nsp -= 1;
//                    row++;

            }

                else{
                    System.out.println();
                    nst -= 1;
                    nsp += 1;
//                    row++;


            }

        }
    }
}


