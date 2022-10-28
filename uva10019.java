
import java.util.*;
import static java.lang.System.*;
public class uva10019{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ddd=sc.nextInt();
    int kkk=0;
    while(kkk!=ddd){
	    String a=sc.next();
	    while(a.equals("")){
	    	a=sc.next();
	    }
	    int b=Integer.parseInt(a);
	    int count1=1;
	    int count2=1;
	    int c=0;
	    int d=16;
		while(b!=1){
			if(b%2==1){
			count1++;
			}
			b=b/2;
		}
		for(int i=0 ; i<a.length() ; i++){
			for(int k=0 ; k<i-1 ; k++){
				d=d*16;
			}
			if(i==0){
				c=((a.charAt(a.length()-1)-48))+c;
			}
			else{
				c=((a.charAt(a.length()-i-1)-48))*d+c;
				//直接*d;
			}
		}
		while(c!=1){
			if(c%2==1){
			count2++;
			}
			c=c/2;
		}
		System.out.println(count1+" "+count2);
		kkk++;
	}
  }
};
