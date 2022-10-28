import java.util.*;
import static java.lang.System.*;
public class main{
static int count=0;
static int x=0;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
		int []f=new int [20000];
	    int c=0;
	   	x=Integer.parseInt(sc.nextLine());//因為讀取int讀不到enter 導致超過一筆資料會只算一筆 只好用讀字串轉int
	   	String b=sc.nextLine();//同理
	   	String []d=b.split(" ");//切割
	   	//System.out.println("x"+x);
	   	//System.out.println("b"+b);
	   	for(int i=0 ; i<d.length ; i++){
	   		//System.out.println("i:"+i+"d[i]"+d[i]);
	   	}
	   	for(int i=0 ; i<d.length ; i++){//塞入數字陣列
	   		f[count++]=Integer.parseInt(d[i]);
	   	}
	    f(f);
	}
  }
  public static int t(int a,int b){//a的b次方
  	int c=a;//不想用double 所以不使用Math.pow(a,b);
  	if(b==0){
  	//System.out.println("return 1");
  	return 1;
  	}
  	for(int i=1 ; i<b ;i++){
  		a=a*c;
  	}
  	//System.out.println("a:"+a+",b:"+b);
  	return a;
  }
  public static void f(int []f){
  int c=0;
  int sum=0;
  	for(int i=count-1 ; i!=0 ; i--){
		sum=sum+f[c++]*(i)*t(x,i-1);//i==(次方-1),t(x,i-1)==x的(i-1)次方
	}
	System.out.println(sum);
	sum=0;
  }
}
