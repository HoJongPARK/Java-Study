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
		System.out.println("주문 번호: "+orderNum );
		System.out.println("주문자 아이디: "+userId );
		System.out.println("주문 날짜: "+orderDate );
		System.out.println("주문자 이름: "+userName );
		System.out.println("주문 상품 번호: "+itemNum );
		System.out.println("배송 주소: "+destination );
		
	}
}
