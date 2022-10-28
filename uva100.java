import java.util.*;
public class uva100 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int count=0;
    	int ca=0;
        while(sc.hasNextInt()){
        	ca++;
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int count1=0;
	        if(a>b){
	        	int c=a;
	        	a=b;
	        	b=c;
	        	count1=1;
	        }
	        System.out.println(a+" "+b);
	        for(int n=a ; n<=b ; n++){
	        	count=circle(n)>count ? circle(n) : count ;
	        }
	        if(count1==1){
	        	System.out.println(b+" "+a+" "+count);
	        	count1=0;
	        }
	        else{
	        	System.out.println(a+" "+b+" "+count);
	        }
			count=0;
        }
        
    }
    public static int circle(int n){
    	int count=1;
		while(n!=1){
			if(n%2==1){
					n=3*n+1;
		        	count++;
		    }
		    else{
		        n=n/2;
		        count++;
		    }
		}
		return count;
    }
}
