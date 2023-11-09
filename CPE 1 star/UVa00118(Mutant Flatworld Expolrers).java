import java.util.Arrays;
import java.util.Scanner;

public class UVa00118 {
	// 此class類別為此作業2，此程式為計算在經過一串指令後，機器人的所在座標
	// 首個輸入的測資會是右上角的邊界，接著依序輸入機器人的座標方位，以及指令
	// 程式執行過程中會判斷機器人是否超出邊界，若是掉出邊界則記錄該位置
	// 後面的機器人若是走到前面機器人掉下去前的座標，會忽略使其掉下去的指令
	// 程式會輸出機器人的最終座標，若是掉出邊界則輸入掉出去前的座標並加上LOST
	public static void main(String[] args) {

		int positionNumber = 0; // 宣告變數positionNumber為機器人方向的編號
		char finalPosition = ' '; // 宣告字元finalPosition為機器人的最終方向

		Scanner sc = new Scanner(System.in);
		int edge[] = new int[2];
		for (int i = 0; i < 2; i++) { // 設置for迴圈讀取邊界
			edge[i] = sc.nextInt();
		}
		boolean array[][] = new boolean[51][51];
		for (int i = 0; i < 51; i++)
			Arrays.fill(array[i], false);

		while (sc.hasNext()) {
			int x = sc.nextInt(); // 宣告變數x為目前x座標
			int y = sc.nextInt(); // 宣告變數y為目前y座標
			String nowPosition = sc.next(); // 宣告字串nowPosition為目前方位
			String instructions = sc.next(); // 宣告字串instructions來儲存指令

			if (nowPosition.equals("N")) {
				positionNumber = 0;
			} else if (nowPosition.equals("E")) {
				positionNumber = 1;
			} else if (nowPosition.equals("S")) {
				positionNumber = 2;
			} else if (nowPosition.equals("W")) {
				positionNumber = 3;
			}
			// 設置判斷式來判斷方位，並將其轉換為方位編號
			// 判斷為N則將設置positionNumber為0；判斷為E則將設置positionNumber為1
			// 判斷為S則將設置positionNumber為2；判斷為W則將設置positionNumber為3
			for (int i = 0; i < instructions.length(); i++) {
				char instruction = instructions.charAt(i); // 從instructions中獲取每個指令

				int nowX = x;
				int nowY = y;

				if (instruction == 'R') {
					positionNumber = (positionNumber + 1) % 4;
					// 若指令為R則向右旋轉(即positionNumber加1並取其除以四的餘數)
				} else if (instruction == 'L') {
					positionNumber = (positionNumber + 3) % 4;
					// 若指令為R則向左旋轉(即positionNumber加3並取其除以四的餘數)
				} else if (instruction == 'F') {
					if (positionNumber == 0) {
						nowY += 1; // 向北移動
					} else if (positionNumber == 1) {
						nowX += 1; // 向東移動
					} else if (positionNumber == 2) {
						nowY -= 1; // 向南移動
					} else if (positionNumber == 3) {
						nowX -= 1; // 向西移動
					}
					// 若指令為F則判斷當下面對方位並往相應方向移動

					if (nowX > edge[0] || nowY > edge[1] || nowX < 0 || nowY < 0) {
						if (!array[x][y]) {
							array[x][y] = true;
							finalPosition = getDirection(positionNumber);
							System.out.println(x + " " + y + " " + finalPosition + " LOST");
							break;
						}
					}
					// 判斷此座標先前是否有機器人超出邊界，並判斷目前的機器人是否超出邊界
					else {
						x = nowX;
						y = nowY;
					}
				}
				if (i == instructions.length() - 1) {
					finalPosition = getDirection(positionNumber); // 查詢最終面向方位
					System.out.println(x + " " + y + " " + finalPosition);
				}
				// 當指令是最後一筆時即可輸出結果(無超出界線之情況下)
			}
		}
		sc.close(); // 關閉Scanner
	}

	public static char getDirection(int finalNumber) {
		// 自定義查詢最終面向方位的方法
		// finalNumber為positionNumber經迴圈運算之最終結果
		// 若finalNumber為0則回傳N；若finalNumber為1則回傳E
		// 若finalNumber為2則回傳S；若finalNumber為3則回傳W
		// 默認回傳為空白
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
