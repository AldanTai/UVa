import java.util.Arrays;
import java.util.Scanner;

public class UVa00118 {
	
	public static void main(String[] args) {

		int positionNumber = 0; 
		char finalPosition = ' '; 

		Scanner sc = new Scanner(System.in);
		int edge[] = new int[2];
		for (int i = 0; i < 2; i++) { 
			edge[i] = sc.nextInt();
		}
		boolean array[][] = new boolean[51][51];
		for (int i = 0; i < 51; i++)
			Arrays.fill(array[i], false);

		while (sc.hasNext()) {
			int x = sc.nextInt(); 
			int y = sc.nextInt(); 
			String nowPosition = sc.next(); 
			String instructions = sc.next(); 

			if (nowPosition.equals("N")) {
				positionNumber = 0;
			} else if (nowPosition.equals("E")) {
				positionNumber = 1;
			} else if (nowPosition.equals("S")) {
				positionNumber = 2;
			} else if (nowPosition.equals("W")) {
				positionNumber = 3;
			}
			
			for (int i = 0; i < instructions.length(); i++) {
				char instruction = instructions.charAt(i); 

				int nowX = x;
				int nowY = y;

				if (instruction == 'R') {
					positionNumber = (positionNumber + 1) % 4;
					
				} else if (instruction == 'L') {
					positionNumber = (positionNumber + 3) % 4;
					
				} else if (instruction == 'F') {
					if (positionNumber == 0) {
						nowY += 1; 
					} else if (positionNumber == 1) {
						nowX += 1; 
					} else if (positionNumber == 2) {
						nowY -= 1; 
					} else if (positionNumber == 3) {
						nowX -= 1;
					}
					
					if (nowX > edge[0] || nowY > edge[1] || nowX < 0 || nowY < 0) {
						if (!array[x][y]) {
							array[x][y] = true;
							finalPosition = getDirection(positionNumber);
							System.out.println(x + " " + y + " " + finalPosition + " LOST");
							break;
						}
					}
					
					else {
						x = nowX;
						y = nowY;
					}
				}
				if (i == instructions.length() - 1) {
					finalPosition = getDirection(positionNumber); 
					System.out.println(x + " " + y + " " + finalPosition);
				}
				
			}
		}
		sc.close(); 
	}

	public static char getDirection(int finalNumber) {
		
		switch (finalNumber) {
		case 0:
			return 'N';
		case 1:
			return 'E';
		case 2:
			return 'S';
		case 3:
			return 'W';
		default:
			return ' ';
		}
	}
}
