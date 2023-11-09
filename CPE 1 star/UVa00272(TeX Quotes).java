import java.util.Scanner;

public class UVa00272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (sc.hasNextLine()) {
			String sentence = sc.nextLine();
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == '"' && count % 2 == 1) {
					System.out.print("``");
					count++;
				} else if (sentence.charAt(i) == '"' && count % 2 == 0) {
					System.out.print("''");
					count++;
				} else {
					System.out.print(sentence.charAt(i));
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
