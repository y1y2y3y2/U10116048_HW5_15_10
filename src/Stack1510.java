//U10116048 資科三 楊明璋 作業15.10
import java.util.ArrayList;
import java.util.Scanner;
public class Stack1510{
	public static void main(String[] args) {
		String str=" ";//用來存放輸入字串
		MyStack a = new MyStack();
		Scanner keyin =new Scanner(System.in);
		//使用者輸入
		System.out.println("15.10TestProgram");
		for(int i=1;i<=5;i++){//輸入5次
			System.out.print("第"+i+"次輸入 請輸入1個字串");
			System.out.print(" --->");
			str=keyin.next();
			a.add(str);//加入ArrayList
		}		
		//直接印出存放資料
		System.out.println("以正序印出資料:");
		for(int i=0;i<=4;i++){
			System.out.print(a.get(i)+",");
		}
		System.out.println();
		//DeepCopy
		for(int i=0;i<=4;i++){
			a.DeepCopy(i); 
		}
		//印出deepcop後新的ArrayList資料
		System.out.println("deepcop後新的ArrayList資料:");
		for(int i=0;i<=4;i++){
			a.ShowDeepCopy(i); 
		}
		
	}

}
class MyStack extends ArrayList{
	ArrayList<Object> list = new ArrayList<Object>();//deep copy
	//因為使用繼承 故ArrayList定義過的method不用再定義
	public String getElement(int i){
		String x=get(i).toString();
		return x;
	}
	public void reverseDisplay(){//反序取出值
		int x=size();//大小-1極為最後索引值		
		//從ArrayList取出項目
		for(int i=x-1;i>=0;i--){
			System.out.print(getElement(i)+",");
		}
	}
	/*deep copy*/
	public void DeepCopy(int i){
		String x=(get(i).toString());
		list.add(x);//把輸入引數對應的值copy到1個新的ArrayList
	}
	public void ShowDeepCopy(int x){
		System.out.print(list.get(x)+",");
	}

}
