package p197q5;

public class storetest {

	public static void main(String[] args) {
		Person person1=new Person("�达",30000);
		Person person2=new Person("�̾�",40000);

		Store store1=new Store("���ٹ�");
		Store store2=new Store("��ٹ�");
		
		person1.takeJuice(store1, "�Ƹ޸�ī��");
		person2.takeJuice(store2, "����");
		person2.takeJuice(store2, "����");
	}

}
