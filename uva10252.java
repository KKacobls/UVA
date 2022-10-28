import java.util.*;
public class uva10252 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
	        String f=sc.nextLine();
	        //System.out.println("s:"+s);
	        //System.out.println("f:"+f);
			if(s.equals("")&&f.equals("")){
				System.out.println("");
	        	s=sc.nextLine();
		        f=sc.nextLine();
			}
			String S[]=s.split("");
			String F[]=f.split("");
			int count=0;
			String Answer[]=new String[S.length > F.length ? S.length : F.length];
			Arrays.sort(S);Arrays.sort(F);
			for(int i=0 ; i<S.length ; i++){
				for(int k=0 ; k<F.length ; k++){
					if(S[i].charAt(0)==F[k].charAt(0)&&S[i].charAt(0)!='0'&&S[i].charAt(0)!=32){
						Answer[count++]=F[k];
						S[i]="0";F[k]="0";
						if(i!=S.length-1){
							i++;
						}
					}
				}
			}
			for(int i=0 ; i<count ;i++ ){
						System.out.print(Answer[i]);
			}
			System.out.printf("\r");
			System.out.print("\n");
        }
    }
}
