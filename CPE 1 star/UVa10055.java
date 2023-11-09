import java.util.Scanner;

public class UVa10055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				Long a = sc.nextLong();
				Long b = sc.nextLong();
				Long gap = Math.abs(a - b);
				System.out.println(gap);
			} catch (Exception e) {
				break;
			}

		}
		sc.close();
	}
}