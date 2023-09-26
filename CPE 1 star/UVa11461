import java.util.Scanner;

public class A411177012_0 {
	public static void main(String[] args) {
		int a;   //設定變數a(題目提供)
		int b;   //設定變數b(題目提供)
		int quantity = 0;   //設定變數quantity(當作最後計算平方數個數之變數)

		Scanner sc = new Scanner(System.in);
		while (true) {   //設置while迴圈
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) {   //設置條件，若a=0且b=0則跳出迴圈
				break;
			}
			double begin = Math.sqrt(a);  //設置變數begin作為a的平方根
			double end = Math.sqrt(b);    //設置變數end作為b的平方根
			quantity = (int) Math.floor(end) - (int) Math.ceil(begin) + 1;
			//將begin小數點後無條件進位，end小數點後無條件捨去，並將兩數轉為int，
			//由後者減去前者，即可得出a和b之間的平方數個數
			System.out.println(quantity);   //使用println印出quantity
		}
		sc.close();   //關閉Scanner
	}
}
