
import java.util.*;
import static java.lang.System.*;
public class uva10050{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int Case=sc.nextInt();
    for(int y=0 ; y<Case ; y++){
    	int allday=sc.nextInt();//�����Ѽ�
    	int p[]=new int [sc.nextInt()];//�F�ҽ}�u�Ѽ�
    	for(int i=0 ; i<p.length ; i++){
    		p[i]=sc.nextInt();
    	}
    	int a[]=new int [allday];
    	int c=0;//��ڼv�T�Ѽ�
    	int d=0;
    	for(int day=1 ; day<=allday ; day++){
    		int tday=(day-1)%7;//1���O�P����
    		for(int i=0 ; i<p.length ; i++){//���ƭp��n�ư�
    			d=0;
	    		if(day%p[i]==0 && tday!=5 && tday!=6){//56����
	    			if(c!=0){
		    			for(int k=0 ; k<c ; k++){//��O�_������
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
