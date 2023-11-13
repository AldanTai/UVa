import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class UVa10420{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		String country[]=new String[cases];
		Set<String> set=new HashSet<String>();
		
		
		for(int i=0;i<cases;i++){
			country[i]=sc.next(); 
			set.add(country[i]); 
			String No=sc.nextLine(); 
		}
		
		
		Arrays.sort(country);
		String st[]=set.toArray(new String[set.size()]);
		Arrays.sort(st);
		
		
		for(int i=0;i<st.length;i++){
			int count=0;
			for(int j=0;j<cases;j++){
				if(st[i].equals(country[j])) count++;
			}
			
			System.out.println(st[i]+" "+count);	
		}
	}
}
