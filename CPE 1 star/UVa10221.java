import java.util.Scanner;

public class UVa10221{
	public static void main(String args[]){
		final int r=6440;
		
		Scanner sc=new Scanner(System.in);
			
		while(sc.hasNext()){
			int s=sc.nextInt();
			double a=sc.nextInt();
			String type=sc.next();
			
			if(type.equals("deg")){
				a=Math.min(360-a,a);
			}else{
				a/=60;
			}
			
			double arc=2*Math.PI*(s+r)*a/360;
			double chord=Math.sqrt(2*Math.pow(s+r,2)*(1-Math.cos(a*Math.PI/180)));
			System.out.printf("%.6f %.6f",arc,chord);
			System.out.println();
		}
	}
}