import java.util.Scanner;

public class Uva00299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		while (true) {
			try {
				int size = sc.nextInt();
				int Arr[] = new int[size];
				for (int i = 0; i < size; i++) {
					Arr[i] = sc.nextInt();
				}
				int swap = 0;
				for (int i = 0; i < Arr.length - 1; i++) {
					for (int j = i + 1; j < Arr.length; j++) {
						if (Arr[i] > Arr[j]) {
							int num = Arr[i];
							Arr[i] = Arr[j];
							Arr[j] = num;
							swap++;
						}
					}
				}
				System.out.println("Optimal train swapping takes " + swap + " swaps.");
			} catch (Exception e) { // 設定若是遇到EOF情況就跳出迴圈
				break;
			}
		}
		sc.close();
	}
}
