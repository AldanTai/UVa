//Java
import java.util.Scanner;

class uva11150{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int N=sc.nextInt();
			
			int ans=0;
			if(N<=1){
				//當N<=1時，直接印出目前有幾罐可樂。因為他再怎麼跟朋友借瓶子，也無法歸還空瓶。
				System.out.println(N);
			}else{
				//ans=最多可以喝多少可樂。初始化為一開始所擁有的可樂數量。
				ans=N;
				
				//當瓶子剩下1根時，結束迴圈。
				while(N!=1){
					
					if(N==2) N=N+1;//當N==2時再跟朋友借一個瓶子。
					ans=ans+N/3;//喝掉的可樂數量
					
					N=N%3+N/3;//目前的瓶子=原本剩下的瓶子+兌換後的瓶子
				}
				
				//結果輸出
				System.out.println(ans);
			}
		}
	}
}