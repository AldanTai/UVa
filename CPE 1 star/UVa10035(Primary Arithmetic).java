import java.util.Scanner;

public class UVa10035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = 0;
			int carry = 0;
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			while (A != 0 || B != 0) {
				if (A % 10 + B % 10 + carry >= 10) {
					count++;
					carry = 1;
				} else {
					carry = 0;
				}
				A /= 10;
				B /= 10;
			}
			if (count == 0) {
				System.out.println("No carry operation.");
			} else {
				if (count == 1) {
					System.out.println("1 carry operation.");
				} else {
					System.out.println(count + " carry operations.");
				}
			}
		}
		sc.close();
	}

}
