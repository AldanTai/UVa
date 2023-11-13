import java.util.Scanner;

class uva11005{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt(); 
		for(int casesCout=0;casesCout<cases;casesCout++){
			System.out.println("Case "+(casesCout+1)+":");
			
			int alphabetMoney[]=new int[36]; 
			for(int i=0;i<alphabetMoney.length;i++) alphabetMoney[i]=sc.nextInt();
			
			int changeSize=sc.nextInt();
			int change[]=new int[changeSize]; 
			for(int i=0;i<changeSize;i++) change[i]=sc.nextInt();
			
			for(int i=0;i<changeSize;i++){
				int totalMoney[]=new int[37]; 
				
        			
        			for(int j=2;j<37;j++){
					for(int k=0;k<changeSize;k++){
						int changeTemp=change[i];
						while(changeTemp>0){
							int temp=changeTemp%j;
							changeTemp/=j;
							totalMoney[j]+=alphabetMoney[temp];
						}		
					}
				}
        
				
				int minMoney=totalMoney[2];
				for(int j=3;j<37;j++) if(totalMoney[j]<minMoney) minMoney=totalMoney[j];
				
				
				System.out.print("Cheapest base(s) for number "+change[i]+":");
				for(int j=2;j<37;j++) if(totalMoney[j]==minMoney) System.out.print(" "+j);
				System.out.println("");
			}
			if(casesCout!=cases-1) System.out.println("");
		}
	}
}
