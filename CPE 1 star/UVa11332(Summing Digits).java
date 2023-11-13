import java.util.Scanner;

public class UVa11332{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String st=sc.next();
			if(st.equals("0")) break;
			
			//字元相加，加到st長度只有1為止(只有個位數)。
			int num=0;
			while(st.length()!=1){
				for(int i=0;i<st.length();i++){
					num=num+st.charAt(i)-48;
				}
				st=Integer.toString(num);
				num=0;
			}
			//Output
			System.out.println(st);
		}
	}
}
