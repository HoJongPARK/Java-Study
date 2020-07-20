package inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] arr=new Customer[5];
		arr[0]=new VIPCustomer(10000,"1");
		arr[1]=new GoldCustomer(10001,"2");
		arr[2]=new GoldCustomer(10002,"3");
		arr[3]=new Customer(10003,"4");
		arr[4]=new Customer(10004,"5");
		
		for(int i=0;i<5;i++)
			arr[i].calcPrice(10000);
		
	}

}
