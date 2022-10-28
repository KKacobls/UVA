import java.util.*;
import static java.lang.System.*;
public class uva11461{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
		int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=1;
    	if(a>0 && b>0){
		    int count=0;
		    int d=0;
		    while(d<=b){
		    d=c*c;//從1開始算評方曙
		    	if(d>=a && d<=b){//d介於a和b之間(等於)
			    	c++;//平方數++(1*1)變(2*2)
			    	count++;//count++
		    	}
		    	if(d<a){//平方數<a 代表平方數要增加
		    		c++;
		    	}
		    	
		    }
		    System.out.println(count);
	    }
    }
  }
}//這題一開始用forfor去跑 跑了7s:)
