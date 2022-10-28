import java.util.*;
public class uva10055 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNext()){
	        long a=sc.nextLong();
	        long b=sc.nextLong();
	        b= a-b>0 ? a-b : b-a ;
	        System.out.println(b);//沒這行會錯
        }
    }
}
