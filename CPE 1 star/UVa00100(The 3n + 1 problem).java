import java.util.Scanner;

public class UVa00100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);

			int c = 0; 
			for (int i = min; i <= max; i++) {
				int temp = 1; 
				for (int j = i; j != 1;) {
					if (j % 2 == 0)
						j = j / 2;
					else
						j = j * 3 + 1;
					temp++;
				}

				if (temp > c)
					c = temp; 
			}
			
			System.out.println(a + " " + b + " " + c);
		}
		sc.close();
	}
}
