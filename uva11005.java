import java.util.*;
import static java.lang.System.*;
public class uva11005{
  	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int Case=sc.nextInt();
    	for(int q=0 ; q<Case ; q++){
    		System.out.print("Case "+(q+1)+":"+"\r\n");
    		int price[]=new int [36];
    		for(int i=0 ; i<price.length ; i++){
    			price[i]=sc.nextInt();
    		}
    		int count=sc.nextInt();//��J�X��
    		int mux[]=new int [35];//�i�����(2~36�i��)36-2+1
    		for(int m=0 ; m<count ; m++){
    			int cheapest=sc.nextInt();
    			System.out.print("Cheapest base(s) for number "+cheapest+": ");
    			for(int i=2 ; i<=36 ; i++){
    				mux[i-2]=t(cheapest,i,price);
    			}
    			//��mux�}�C���̤p��
    			int c=0;
    			int copymux[]=new int [mux.length];
    			for(int i=0 ; i<copymux.length ; i++){
    				copymux[i]=mux[i];
    			}
    			Arrays.sort(copymux);
    			for(int i=0 ; i<copymux.length-1 ;i++){
    				if(copymux[i]==copymux[i+1]){
    					c=c+1;
    				}
    				else{
    					break;
    				}
    			}//c����̤p�Ȫ��ƶq//copy[0]����̤p���Ʀr
    			for(int i=0 ; i<mux.length ; i++){
    				if(mux[i]==copymux[0]){
    					System.out.print(i+2);
    					c--;
    					//System.out.print(c+" ");
    					if(c==-1){
    						System.out.print("\r\n");
    					}
    					else{
    						System.out.print(" ");
    					}
    				}
    			}
    			if(m==count-1 && q!=Case-1){//Case�����n�Ů� ���̫�@�Ӥ��ΪŮ�
    				System.out.print("\r\n");
    			}
    		}
    	}
  	}
  	public static int w(int price[],String d,int b){//��$
  		int total=0;
  		String dSplit[]=d.split(" ");
  		for(int i=0 ; i<dSplit.length ; i++){
  			total=price[Integer.parseInt(dSplit[i])]+total;
  		}
  		return total;
  	}
	public static int t(int a,int b,int price[]){//a(10)��b�i��(b~int����
		int count=0;
		String d="";
		while(a>=b){
			int c=a%b;
			d=c+" "+d;
			a=a/b;
		}
		d=a+" "+d;
		//System.out.print("\n"+"d:"+d+"b:"+b+"\n");
		return w(price,d,b);
	}
}
