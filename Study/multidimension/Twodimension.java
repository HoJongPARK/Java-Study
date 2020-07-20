package multidimension;

public class Twodimension {

	public static void main(String[] args) {
		char a='a';
		char[][] english=new char[13][2];
		for(int i=0;i<13;i++) {
			for(int j=0;j<2;j++) {
				english[i][j]=a++;
				System.out.print(english[i][j]);
			}
			System.out.println();
			
		}

	}

}
