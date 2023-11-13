import java.util.Scanner;

public class UVa10242{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextDouble()){
			double point[][]=new double[4][2];
			double same[]=new double[2];
			for(int i=0;i<point.length;i++){
				for(int j=0;j<point[i].length;j++){
					point[i][j]=sc.nextDouble(); 
				}
				
				for(int j=0;j<i;j++){
					if(point[j][0]==point[i][0] && point[j][1]==point[i][1]){
						same[0]=point[i][0];
						same[1]=point[i][1];
					}
				}
			}
			
			
			double x=0,y=0;
			for(int i=0;i<point.length;i++){
				if(!(point[i][0]==same[0] && point[i][1]==same[1])){
					x+=point[i][0];
					y+=point[i][1];
				}
			}
			System.out.printf("%.3f %.3f",x-same[0],y-same[1]);
			System.out.println("");
		}
	}
}
