package p230;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] arr=new Dog[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Dog("¸»Æ¼Áî","Sex");
			System.out.println(arr[i].showDogInfo());
		}
		for(Dog dog:arr)
			System.out.println(dog.showDogInfo());
	}

}
