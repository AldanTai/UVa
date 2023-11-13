import java.util.Scanner;

public class UVa10931{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int num;
		while(sc.hasNext() && (num=sc.nextInt())!=0){
			String st=Integer.toBinaryString(num);
			

			int count=0;
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)=='1') count++;
			}

			System.out.println("The parity of "+st+" is "+count+" (mod 2).");
		}
	}
}