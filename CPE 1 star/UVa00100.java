import java.util.Scanner;

public class UVa00100 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min = Math.min(a, b);
			int max = Math.max(a, b);

			int c = 0; // 3n+1 所需要迴圈次數的最大值
			for (int i = min; i <= max; i++) {
				int temp = 1; // 3n+1 所需要迴圈次數
				for (int j = i; j != 1;) {
					if (j % 2 == 0)
						j = j / 2;
					else
						j = j * 3 + 1;
					temp++;
				}

				if (temp > c)
					c = temp; // 判別此數的迴圈次數是否為最大值
			}
			// Output
			System.out.println(a + " " + b + " " + c);
		}
	}
}