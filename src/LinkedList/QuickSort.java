package LinkedList;

public class QuickSort {

	public static void main(String args[]) {
		int arr[] = { 9, 0, 67, 78, 0, 287, -1, 98 };
		sol(arr, 0, arr.length - 1);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}

	public static void sol(int arr[], int lo, int hi) {
if(lo>hi||lo==hi)
{
	return;
}
		
		int strt = lo;
		int key = arr[strt];
		int pi = strt;
		int end = hi;
		while (strt < end) {

			while (arr[strt] <= key) {
				strt++;
			}

			while (arr[end] > key) {
				end--;
			}
			if (strt > end) {
				int temp = arr[pi];
				arr[pi] = arr[end];
				arr[end] = temp;
			} else {
				int temp = arr[strt];
				arr[strt] = arr[end];
				arr[end] = temp;
			}

		}
		sol(arr, lo, end - 1);
		sol(arr, end + 1, hi);

	}

}