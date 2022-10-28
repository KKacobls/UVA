
import java.util.*;
import static java.lang.System.*;
public class uva10050{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Case=sc.nextInt();
    for(int y=0 ; y<Case ; y++){
    	int allday=sc.nextInt();//全部天數
    	int p[]=new int [sc.nextInt()];//政黨罷工天數
    	for(int i=0 ; i<p.length ; i++){
    		p[i]=sc.nextInt();
    	}
    	int a[]=new int [allday];
    	int c=0;//實際影響天數
    	int d=0;
    	for(int day=1 ; day<=allday ; day++){
    		int tday=(day-1)%7;//1號是星期天
    		for(int i=0 ; i<p.length ; i++){//重複計算要排除
    			d=0;
	    		if(day%p[i]==0 && tday!=5 && tday!=6){//56不算
	    			if(c!=0){
		    			for(int k=0 ; k<c ; k++){//找是否有重複
		    				if(a[k]==day){
		    					break;
		    				}
		    				if(k==c-1){
		    					a[c++]=day;
		    				}
		    			}
	    			}
	    			else{
	    				a[c++]=day;
	    			}
	    		}
    		}
    	}
    	System.out.println(c);
    }
  }
}
