import java.util.*;
import static java.lang.System.*;
public class uva10783{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int c=0;int count=0;
    int d=sc.nextInt();
    while(sc.hasNext()){
    	for(int k=0 ; k<d ; k++){
	    	count++;
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	for(int i=a ; i<=b ; i++){
	    		if(i%2==1){
	    			c=c+i;
	    		}
	    	}
	    	System.out.println("Case "+count+": "+c);
	    	c=0;
    	}
    }
  }
};
