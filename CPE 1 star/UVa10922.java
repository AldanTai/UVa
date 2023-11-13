import java.util.Scanner;

public class UVa10922{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	  
		while(sc.hasNext()){
			String st=sc.next();
			
		
			if(st.equals("0"))break;
			
			int count=0;
			String temp=st;
			while(true){
				int total=0;
				for(int i=0;i<temp.length();i++){
						total=total+temp.charAt(i)-48;
					}
				
				if(total%9==0){
					count++;
					if(total==9) break;
					else temp=Integer.toString(total);
					
				}else{
					break;
				}
			}
			
		
			if(count!=0) System.out.println(st+" is a multiple of 9 and has 9-degree "+count+".");
			else System.out.println(st+" is not a multiple of 9.");
			
		}
	}
}