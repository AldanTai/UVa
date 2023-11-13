import java.util.Scanner;
import java.util.Vector;

public class UVa10235{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String n=sc.next(); 
			String r="";  
			
			
			for(int i=n.length()-1;i>=0;i--){
				r=r+n.charAt(i);
			}
			
			if(isPrime(Integer.parseInt(n)) && isPrime(Integer.parseInt(r)) && !n.equals(r)) System.out.println(n+" is emirp."); //r,n皆為質，且r!=n
			else if(isPrime(Integer.parseInt(n))) System.out.println(n+" is prime."); 
			else System.out.println(n+" is not prime."); 
			
		}
	}
	
	public static boolean isPrime(int n){
		boolean flag=true;
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}