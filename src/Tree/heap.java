package Tree;

import java.util.*;

public class heap {

	ArrayList<Integer> list = new ArrayList();

	public void add(int val) {
		list.add(val);
		heapify(list, list.size() - 1);
	}

	public void display() {
		System.out.println(list);
	}

	private void heapify(ArrayList<Integer> list, int idx) {
		double d = (int)(Math.ceil((idx+0.0)/2.0)-1);
//System.out.println(d);
		int parent =(int)d;
		if (idx <= 0) {
			return;
		}
		if (list.get(parent) > list.get(idx)) {
//		System.out.println(parent);
			int temp = list.get(parent);
			list.set(parent, list.get(idx));
			list.set(idx, temp);
//		swap;
			heapify(list, parent);

		}
	}

	public int delete() {
		int temp = list.get(0);
		list.set(0, list.size() - 1);
		list.remove(list.size() - 1);
		delete(list, 0);
		return temp;
	}

	public void delete(ArrayList<Integer> list, int idx) {
		int left = idx * 2 + 1;
		int right = idx * 2 + 2;
		if(left>=list.size())return;
		int temp = idx;
		if (left < list.size() && list.get(idx) > list.get(left)) {
			temp = left;
		}
		if (right < list.size() && list.get(idx) > list.get(right)) {
			if (list.get(temp) > list.get(right)) {
				temp = right;
			}
		}
		int val = list.get(temp);
		list.set(temp, list.get(idx));
		list.set(idx, val);
		delete(list, temp);

	}
	public static void main(String args[])
	{
		heap h=new heap();
		h.add(10);
		h.add(30);
		h.add(20);
		h.add(50);
		h.add(90);
		h.add(40);
		h.add(0);
		System.out.println(h.list);
	}
}
