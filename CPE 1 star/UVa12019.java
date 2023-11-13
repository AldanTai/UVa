import java.util.Scanner;

class uva12019{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int month[]={31,28,31,30,31,30,31,31,30,31,30,31}; 
			String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //星期表。
			int M=sc.nextInt();
			int D=sc.nextInt();
			
			D=D+4; 
			for(int j=1;j<M;j++){
				D=D+month[j-1];
			}
			
			
			System.out.println(week[D%7]);
		}
	}
}