import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Case=sc.nextInt();
    int c=0;
    for(int f=0 ; f<Case ; f++){
    	System.out.print("Pair #"+(f+1)+": ");
    	int a=t(sc.next());//2轉10
    	int b=t(sc.next());
    	if(a>b){//比較小的放a
    		c=a;
    		a=b;
    		b=c;
    	}
    	c=0;
    	if(b%a==0){//b%a==0代表a就是公因數
    		System.out.print("All you need is love!"+"\r\n");
    	}
    	else{
	    	int count=0;
	    	for(int i=2 ; i<a&&c==0 ; i++){
	    		if(a%i==0){//是a的因數
	    			if(b%i==0){//是b的因數==兩個的公因數
	    				System.out.print("All you need is love!"+"\r\n");
	    				c=1;
	    			}
	    		}
	    	}//都沒有的話
			if(c!=1){System.out.print("Love is not all you need!"+"\r\n");}
		}
    }
  }
  public static int t(String b){//a(2)10
  	int c=1;
  	int total=0;
  	for(int i=b.length()-1 ; i>=0 ; i--){
  		total=total+(b.charAt(i)-48)*c;
  		c=c*2;
  	}
  	return total;
  }
}

