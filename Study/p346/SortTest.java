package p346;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("정렬 방식을 선택하세요");
		int ch=System.in.read();
		
		Sort sort=null;
		
		if(ch=='b')
			sort=new BubbleSort();
		else if(ch=='q')
			sort= new QuickSort();
		else if(ch=='h')
			sort=new HeapSort();
		else
			System.out.println("지원되지 않은 정렬입니다.");
		int[] arr=new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
