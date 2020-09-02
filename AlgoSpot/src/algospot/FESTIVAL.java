package algospot;
import java.util.Scanner;
/**
 * 저는 이 소스 코드를 스스로의 힘으로 작성하였습니다.
 * 만약 소스 코드를 복제한 것이 밝혀지면 어떤 불이익도 감수하겠습니다. 
 * @author 박종호
 */

public class FESTIVAL {

	public static void main(String[] args) {
		int C,N,L;
		int[][] cost=new int[1001][1001];
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		C=scan.nextInt();
		for(int i=1;i<=C;i++) {
			N=scan.nextInt();
			L=scan.nextInt();
			for(int j=1;j<=N;j++)
				cost[j][j]=scan.nextInt();	
			solve(cost,N,L);
		}
	}
	public static void solve(int[][] cost,int N,int L) {
		double min=999999999;
		for(int i=2;i<=N;i++)
			cost[1][i]=cost[1][i-1]+cost[i][i];
		for(int i=2;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				cost[i][j]=cost[i-1][j]-cost[i-1][i-1];
			}
		}
		for(int i=1;i<=N-L+1;i++) {
			for(int j=i+L-1;j<=N;j++) {
				if((double)cost[i][j]/(j-i+1)<min) {
					min=(double)cost[i][j]/(j-i+1);
				}
			}
		}
		System.out.printf("%.12f\n",min);
		
	}
}
