import java.util.Scanner;
import java.util.Arrays;

public class UVa10252{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLine()){
			
			String st1=sc.nextLine();
			String st2=sc.nextLine();
			
	
			int table1[]=new int[26];
			int table2[]=new int[26];
			
		
			Arrays.fill(table1,0);
			Arrays.fill(table2,0);
			
			
			for(int i=0;i<st1.length();i++){
				int temp=st1.charAt(i);
				if(temp>=97 && temp<=122) table1[temp-97]++;
				
			}
			for(int i=0;i<st2.length();i++){
				int temp=st2.charAt(i);
				if(temp>=97 && temp<=122) table2[temp-97]++;

			}
			
			
			for(int i=0;i<26;i++){
				int min=Math.min(table1[i],table2[i]);
				for(int j=0;j<min;j++){
					System.out.print((char)(i+97));
				}
			}
			System.out.println();
		}
	}
}