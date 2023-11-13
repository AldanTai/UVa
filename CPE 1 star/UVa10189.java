import java.util.Scanner;

public class UVa10189 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int fieldNumber = 1;

		while (scanner.hasNextInt()) {
			int rows = scanner.nextInt();
			int cols = scanner.nextInt();

			if (rows == 0 && cols == 0) {
				break;
			}

			if (fieldNumber > 1) {
				System.out.println();
			}

			char[][] field = new char[rows][cols];

			for (int i = 0; i < rows; i++) {
				String row = scanner.next();
				for (int j = 0; j < cols; j++) {
					field[i][j] = row.charAt(j);
				}
			}

			System.out.println("Field #" + fieldNumber + ":");
			solve(field);
			fieldNumber++;
		}

		scanner.close();
	}

	private static void solve(char[][] field) {
		int rows = field.length;
		int cols = field[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (field[i][j] == '*') {
					System.out.print('*');
				} else {
					int count = countAdjacentMines(field, i, j);
					System.out.print(count);
				}
			}
			System.out.println();
		}
	}

	private static int countAdjacentMines(char[][] field, int row, int col) {
		int count = 0;
		int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

		for (int i = 0; i < 8; i++) {
			int newRow = row + dr[i];
			int newCol = col + dc[i];

			if (newRow >= 0 && newRow < field.length && newCol >= 0 && newCol < field[0].length
					&& field[newRow][newCol] == '*') {
				count++;
			}
		}

		return count;
	}
}