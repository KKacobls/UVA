import java.util.*;
public class uva10038 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=0;
        while(sc.hasNext()){
        	e++;
        	int a=sc.nextInt();
			while(a==1){
				a=sc.nextInt();
				System.out.println("Not jolly");
				a=sc.nextInt();
			}
	        int b[]=new int [a-1];
	        int d[]=new int [a];
	        int r=0;
	        for(int i=0 ; i<d.length ; i++){
	        	d[i]=sc.nextInt();
	        }
	        for(int i=0 ; i<d.length-1 ; i++){
				b[i]=d[i]-d[i+1]>0 ? d[i]-d[i+1] : d[i+1]-d[i];
	        }
	        	Arrays.sort(b);
	        /*System.out.print("\n");
	        for(int i=0 ; i<b.length ; i++){
	        	System.out.print(b[i]+" ");
	        }*/
	        for(int i=1 ; i<=b.length ; i++){
	        	if(b[i-1]!=i){
	        		System.out.println("Not jolly");
	        		break;
	        	}
	        	if(i==b.length){
	        		System.out.println("Jolly");
	        	}
	        }
        }
    }
}
