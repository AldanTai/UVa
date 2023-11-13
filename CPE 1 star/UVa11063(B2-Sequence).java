import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

class uva11063{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) arr[i]=sc.nextInt();
			
			boolean flag=true;
			if(arr[0]<1) flag=false;
			for(int i=1;i<n;i++) if(arr[i-1]>arr[i]) flag=false; 
			
			
			Vector<Integer> vector=new Vector<Integer>();
			for(int i=0;i<n;i++){
				if(!flag) break;
				for(int j=i;j<n;j++){
					int temp=arr[i]+arr[j];
					Iterator<Integer> iterator=vector.iterator();
					while(iterator.hasNext()){
						if(iterator.next()==temp) flag=false;
					}
					
					
					if(flag) vector.add(temp);
					else break;
				}
			}
			
			if(flag) System.out.println("Case #"+count+": It is a B2-Sequence.");
			else System.out.println("Case #"+count+": It is not a B2-Sequence.");
			System.out.println("");
			count++;
		}
	}
}
