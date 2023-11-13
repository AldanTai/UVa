import java.util.Scanner;

class uva10050{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		while((--cases)>=0){
			int n=sc.nextInt(); 
			int h=sc.nextInt(); 
			
			int party[]=new int[h]; 
			int days[]=new int[n+1]; 
			
			for(int i=0;i<h;i++) party[i]=sc.nextInt();
			
			
			for(int i=0;i<h;i++){
				int temp=0;
				for(int j=1;j<n+1 && (temp=party[i]*j)<n+1;j++){
					days[temp]=1;
				}
			}
			
			int count=0;
			for(int i=0;i<n+1;i++) if(i%7!=6 && i%7!=0 && days[i]==1) count++; //星期五、星期六不須計算。
			
			System.out.println(count);
		}
	}
}