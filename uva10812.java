import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){//分析 看題目a是下面有幾行 每行2測資
	    int a=sc.nextInt();//左邊是b右邊是c
	    int b;int c;//b<c輸出impossible
	    for(int i=0 ; i<a ;i++){
	    	b=sc.nextInt();//(b+c)%2==1 輸出impossible
	    	c=sc.nextInt();//b==c 輸出"b 0"
	    	//System.out.println("b:"+b+"c:"+c);//b>c 會出現n n-c//規律是b=n+(n-c)
		    if(b<c || (b+c)%2==1){
		    	System.out.println("impossible");
		    }
		    else if(b>c){//所以b+c=2n才要輸出
		    	int n=(b+c)//輸出"n (n-c)"
		    	System.out.println(n+" "+(n-c));
		    }
		    else{
		    	System.out.println(c);
		    }
		    //System.out.println("a:"+a+"b:"+b+"c:"+c);
	    }
    }//幹這題看不懂題目 全靠自己推 屌ㄅ
  }
}
