package ucpc;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(int i=0;i<3;i++)
			arr[i]*=arr[3];
		for(int i=3;i<6;i++)
			arr[i]*=temp;
		int a=arr[1]-arr[4];
		int b=arr[2]-arr[5];
		int y=b/a;
		int x=(arr[2]-arr[1]*y)/arr[0];
		System.out.printf("%d %d",x,y);
		
	}

}
