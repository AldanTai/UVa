import java.util.Scanner;

public class UVa10783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		int caseNumber = 0;
		while(sc.hasNext()) {
			int sum = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int i=a;i<=b;i++) {
				if(i%2!=0) {
					sum+=i;
					
				}
			}
			caseNumber++;
			System.out.println("Case "+caseNumber+": "+sum);
		}
		sc.close();
	}

}
