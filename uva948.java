import java.util.*;
import static java.lang.System.*;

public class uva948{
static int e=0;
static int Length=0;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int f[]=new int [42];
    f[0]=1;f[1]=2;//建立f數列
    for(int i=2 ; i<f.length ; i++){
    	f[i]=f[i-1]+f[i-2];
    }
    int d=sc.nextInt();//有d筆資料
    for(int i=0 ; i<d ;i++){
	    int a=sc.nextInt();//a是要處理的數字
	    System.out.print(a+" = ");
	    while(a!=0){//直到a==0跳出
	    	a=a-t(f,a);
	    }
	    tt(Length);//最後長度不到的話要補0
	    System.out.print(" (fib)"+"\r\n");
	    Length=0;e=0;
    }
  }
  public static int t(int f[],int a){
  int c=0;
  	for(int i=0 ; i<f.length ; i++){
  		if(a<f[i]){//找到離他最近的陣列數字(比a大)
  			c=f[i-1];//要找比他小一個的 所以-1
  			Length = Length==0 ? i : Length ;//第一次要算長度 進制每格都有代表的意義
  			//System.out.println("\n"+"e:"+e+",i:"+i);
  			tt(e-i);//印0 e-i次(原式是e-(i-1)+1 化簡變成e-i+1-1=e-i
  			e=i-1;//記錄下這次i-1(下次要用
  			System.out.print("1");
  			Length--;
  			break;
  		}
  	}
  	return c;//回傳c(a-c==剩下要處理的數字
  }
  public static void tt(int a){//印"0",a次,並檢查長度
  	for(int i=0 ; i<a ; i++){
  		System.out.print("0");
  		Length--;
  	}
  }
}










