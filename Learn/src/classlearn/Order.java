package classlearn;

public class Order {
	String orderNum;
	String userId;
	String orderDate;
	String userName;
	String itemNum;
	String destination;
	
	public Order(String orderNum,String userId,String orderDate,String userName,String itemNum
			,String destination) {
		this.destination=destination;
		this.itemNum=itemNum;
		this.orderDate=orderDate;
		this.orderNum=orderNum;
		this.userId=userId;
		this.userName=userName;
	}
	public void printOrder() {
		System.out.println("�ֹ� ��ȣ: "+orderNum );
		System.out.println("�ֹ��� ���̵�: "+userId );
		System.out.println("�ֹ� ��¥: "+orderDate );
		System.out.println("�ֹ��� �̸�: "+userName );
		System.out.println("�ֹ� ��ǰ ��ȣ: "+itemNum );
		System.out.println("��� �ּ�: "+destination );
		
	}
}
