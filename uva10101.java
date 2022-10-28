import java.util.*;
class uva10101{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(sc.hasNext()){
			long a=sc.nextLong();
			System.out.printf("%4d",++count);
			System.out.print(".");
			if(a==0){
				System.out.print(" 0");
			}
			else{
				t(a);
			}
			System.out.print("\r\n");
		}
	}
	public static void t(Long a){
		if(a>=10000000){
			t(a/10000000);
			System.out.print(" kuti");
			a=a%10000000;
		}//運用遞迴 把最左邊的數字丟到if(a>=1)印出出來
		//然後再取被丟過數字以外繼續重複做 做到沒有為止
		if(a>=100000){
			t(a/100000);
			System.out.print(" lakh");
			a=a%100000;
		}
		if(a>=1000){
			t(a/1000);
			System.out.print(" hajar");
			a=a%1000;
		}
		if(a>=100){
			t(a/100);
			System.out.print(" shata");
			a=a%100;
		}
		if(a>=1){
			System.out.print(" "+a);
		}
	}
}