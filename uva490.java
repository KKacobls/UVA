import java.util.*;
public class uva490 {
	public static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[]=new String [200];
		//count=2;//有幾筆
		while(sc.hasNextLine()){
			a[count]=sc.nextLine();
			if(a[count++].isEmpty()){
				//System.out.print("yee");
				for(int k=0 ; k<t(a) ; k++){//每一個陣列的第k個印出來
					for(int i=count-1 ; i!=-1 ; i--){//切換陣列
						if(a[i].length()>k){
							System.out.print(a[i].charAt(k));
							//System.out.println(i+" "+k);
						}
					}
					System.out.print("\n");
				}
			}
		}
 
	}
	public static int t(String a[]){
		int c=0;

		for(int i=0 ; i<count-1 ; i++){
			//System.out.println(count+" "+a[i].length()+" "+i);
			c=a[i].length()>c ? a[i].length() : c;
		}
		return c;
	}
}