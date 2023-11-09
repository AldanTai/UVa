import java.util.Scanner;

public class UVa10071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				double muzzleVelocity = 0;
				String line = sc.nextLine();
				String arr[] = line.split(" ");
				double speed = Double.parseDouble(arr[0]);
				double time = Double.parseDouble(arr[1]);
				double finalVelocity = (speed / time) * 2 * time;
				double distance = (0 + finalVelocity) * 2 * time * (0.5);
				System.out.println((int) distance);
			} catch (Exception e) {
				break;
			}
		}
		sc.close();
	}

}
