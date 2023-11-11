import java.util.Scanner;

public class A411177012_0 {
	public static void main(String[] args) {
		int a;   
		int b;   
		int quantity = 0;   

		Scanner sc = new Scanner(System.in);
		while (true) {   
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) {   
				break;
			}
			double begin = Math.sqrt(a);  
			double end = Math.sqrt(b);    
			quantity = (int) Math.floor(end) - (int) Math.ceil(begin) + 1;
			System.out.println(quantity);   
		}
		sc.close();   
	}
}
