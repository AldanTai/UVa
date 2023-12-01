import java.util.Arrays;
import java.util.Scanner;

public class UVa10041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		while (sc.hasNext()) {
				int size = sc.nextInt();
				int Arr[] = new int[size];
				for (int i = 0; i < size; i++) {
					Arr[i] = sc.nextInt();
				}
				Arrays.sort(Arr);
				int sum = 0;
				for (int i = 0; i < Arr.length; i++) {
					sum += Math.abs(Arr[size / 2] - Arr[i]);
				}
				System.out.println(sum);
		}
		sc.close();
	}
}
