import java.util.Scanner;
import java.util.TreeMap;

class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int cases=sc.nextInt();
		while(sc.hasNextLine()){
			TreeMap<String,Integer> map=new TreeMap<String,Integer>(); 
			String st;
			int count=0;
			
			
			while(sc.hasNextLine() && !(st=sc.nextLine()).equals("")){
				if(map.containsKey(st)) map.put(st,map.get(st)+1); 
				else map.put(st,1); 
				count++;
			}
			//Output
			for(Object key:map.keySet()){
				System.out.printf("%s %.4f",key.toString(),map.get(key)*100.0/count);
				System.out.println("");
			}
			if(map.size()!=0 && (--cases)>0)System.out.println("");
		}
	}
}
