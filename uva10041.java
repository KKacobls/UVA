import java.util.*;
public class uva10041 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int Answer=0;
		while(sc.hasNextInt()){
			int size=sc.nextInt();
			int c[]=new int [size];
			for(int i=0 ; i<size ; i++){
				c[i]=sc.nextInt();
			}
			Arrays.sort(c);
			int t=c[0];
			c[0]=c[size/2];
			c[size/2]=t;
			for(int i=0 ; i<c.length ; i++){
				//System.out.println("¿é¥Xc[i]°}¦C"+c[i]+" "+count);
			}
			for(int i=1 ; i<c.length ; i++){
				Answer=c[0]-c[i]>0 ? c[0]-c[i]+Answer : c[i]-c[0]+Answer;
			}
			System.out.println(Answer);
			Answer=0;
			count--;
			if(count==0){
				break;
			}
    	}
	}
}
