//Java
import java.util.Scanner;
import java.util.Vector;

public class UVa00490{
	public static void main(String srgs[]){
		Scanner sc=new Scanner(System.in);
		Vector<String> vector=new Vector<String>(); 
		int cases=0; 
		int maxLength=0; 
		
		
		while(sc.hasNextLine()){
			String st=sc.nextLine();
			if(st.length()>maxLength)maxLength=st.length();
			vector.add(st);
			cases++;
		}
		
		int count=0; 
		
		
		for(int i=0;i<maxLength;i++){
			count=0; 
			for(int j=cases-1;j>=0;j--){
				if(!(i>=vector.get(j).length())){ 
					while(count>0){
						System.out.print(" ");
						count--;
					}
					System.out.print(vector.get(j).charAt(i)); 
					count=0;
				}else{
					count++; 
				}
			}
			System.out.println("");
		}
	}
}
