import java.util.*;
public class uva11349{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String N="";
    String a="";
    int n=Integer.parseInt(sc.next());
    for(int e=1 ; e<=n ; e++){
    	L1_out:{
	    	System.out.print("Test #"+e);
	    	N=sc.nextLine();
	    	while(N.equals("")){
	    		N=sc.nextLine();
	    	}
		    int d=t(N);//String N to int d
			int c[][]=new int [d][d];
			for(int i=0 ; i<d ; i++){
				a=sc.nextLine();
				while(a.equals("")){//每一行都輸入成字串
					a=sc.nextLine();
				}
				String b[]=a.split(" ");//字串切割
				//System.out.println("b.length:"+b.length);
				int count=0;
				for(int k=0 ; k<b.length ; k++){
					if(b[k].equals("")){//好像可以用!s1.equals(s2);
					}
					else{
						c[i][count++]=Integer.parseInt(b[k]);//如果放b[i][k]可能會被跳過,所以有塞才要只向下一個
					}
				}
			}
			for(int i=0 ; i<d ; i++){
				for(int k=0 ; k<d ; k++){//0044
				//System.out.println(c[i][k]+" "+c[d-1-i][d-1-k]+"比對");
					if(c[i][k]<0 || c[d-1-i][d-1-k]<0){//只要<0就不是
						System.out.println(": Non-symmetric.");
						break L1_out;
					}
					if(c[i][k]!=c[d-1-i][d-1-k]){//[0,0]對[d-1-0,d-1-0] [0,1]對[d-1-0,d-1-1]以此類推
						//System.out.print(c[i][k]+" "+c[d-1-i][d-1-k]);//其一不對直接跳出
						System.out.println(": Non-symmetric.");
						break L1_out;//break標籤 少用 用於跳出for迴圈 可選擇跳出位置(記得標籤要用{})
					}
				}
				if(i==(d-1)){//檢測完成
					System.out.println(": Symmetric.");
				}
			}
	    }
    }
  }
  public static int t(String N){// N = 5 刪除多餘東西只回傳數字
  	String a="";
  	for(int i=4 ; i<N.length() ; i++){
  		if(N.charAt(i)>=48 && N.charAt(i)<=57)
  		a=a+N.charAt(i);//N = XXXX(X form 4)
  	}
  	return Integer.parseInt(a);
  }
}
//這種題都難在輸入的排序= =只要都放好在array就很簡單