import java.util.Scanner;

public class UVa10409{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases; 
		while(sc.hasNextInt() && (cases=sc.nextInt())!=0){
			
			
			int currPost=1;
			int N=2,W=3,S=5,E=4;
			
			
			for(int i=0;i<cases;i++){
				String st=sc.next();
				if(st.equals("north")){
					N=currPost;
					currPost=S;
					S=7-N;
				}else if(st.equals("south")){
					S=currPost;
					currPost=N;
					N=7-S;
				}else if(st.equals("east")){
					E=currPost;
					currPost=W;
					W=7-E;
				}else if(st.equals("west")){
					W=currPost;
					currPost=E;
					E=7-W;
				}
			}
			
			
			System.out.println(currPost);
		}
	}
}
