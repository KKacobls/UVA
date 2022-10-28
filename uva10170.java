import java.util.*;
public class uva10170 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
	        Long a=sc.nextLong();//3
	        Long b=sc.nextLong();//9
	        Long day=0L;//
			while(true){
				Long i=a;
				if(b<i){
					System.out.println(i);
					break;
				}
				b=b-i;
				if(b<(i+1)){
					System.out.println(i+1);
					break;
				}
				a++;
			}
        }
    }
}