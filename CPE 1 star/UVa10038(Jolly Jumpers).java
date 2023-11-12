import java.util.Arrays;
import java.util.Scanner;

public class UVa10038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
				int size = sc.nextInt();
				int Arr[] = new int[size];
				for (int i = 0; i < size; i++) {
					Arr[i] = sc.nextInt();
				}
				boolean flag=true;
				if(size!=1){
					int arrD[]=new int[size-1];
					for(int i=0;i<Arr.length-1;i++){
						arrD[i]=Math.abs(Arr[i]-Arr[i+1]);
					}
					Arrays.sort(arrD);
					for(int i=0;i<arrD.length;i++){
						if(arrD[i]!=i+1){
							flag=false;
							break;
						}
					}
				}
				if(flag) System.out.println("Jolly");
				else System.out.println("Not jolly");
			}
		}
	}
