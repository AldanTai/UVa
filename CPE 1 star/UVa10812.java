import java.util.Scanner;

public class UVa10812 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		while (sc.hasNext()) {
			long s = sc.nextLong();
			long d = sc.nextLong();
			long x = (s + d) ;
			long y = (s - d) ;
			if (s < 0 || d < 0 || (x%2 != 0 || y%2 != 0)) {
				System.out.println("impossible");
			} else {
				System.out.println(x/2 + " " + y/2);
			}
		}
		sc.close();
	}

}