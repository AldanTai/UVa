import java.util.Scanner;

public class UVa10642{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int x1=sc.nextInt(),y1=sc.nextInt();
			int x2=sc.nextInt(),y2=sc.nextInt();
			
			long count=0; 
			
			for(int j=0;j<(x1+y1);j++){
				count=count-j-1;
			}
			count=count-x1-1;
			
			
			for(int j=0;j<(x2+y2);j++){
				count=count+j+1;
			}
			count=count+x2+1;
			
			System.out.println("Case "+(i+1)+": "+count);
		}
	}
}
