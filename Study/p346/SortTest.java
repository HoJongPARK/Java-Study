package p346;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���� ����� �����ϼ���");
		int ch=System.in.read();
		
		Sort sort=null;
		
		if(ch=='b')
			sort=new BubbleSort();
		else if(ch=='q')
			sort= new QuickSort();
		else if(ch=='h')
			sort=new HeapSort();
		else
			System.out.println("�������� ���� �����Դϴ�.");
		int[] arr=new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
