package p230;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogArrayList=new ArrayList<Dog>();
		for(int i=0;i<5;i++)
			dogArrayList.add(new Dog("»¶Å¥","¼½½º"));
		for(Dog dog:dogArrayList)
			System.out.println(dog.showDogInfo());
		
	}

}
