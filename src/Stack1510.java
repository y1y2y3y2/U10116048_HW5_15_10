//U10116048 ���T ������ �@�~15.10
import java.util.ArrayList;
import java.util.Scanner;
public class Stack1510{
	public static void main(String[] args) {
		String str=" ";//�ΨӦs���J�r��
		MyStack a = new MyStack();
		Scanner keyin =new Scanner(System.in);
		//�ϥΪ̿�J
		System.out.println("15.10TestProgram");
		for(int i=1;i<=5;i++){//��J5��
			System.out.print("��"+i+"����J �п�J1�Ӧr��");
			System.out.print(" --->");
			str=keyin.next();
			a.add(str);//�[�JArrayList
		}		
		//�����L�X�s����
		System.out.println("�H���ǦL�X���:");
		for(int i=0;i<=4;i++){
			System.out.print(a.get(i)+",");
		}
		System.out.println();
		//DeepCopy
		for(int i=0;i<=4;i++){
			a.DeepCopy(i); 
		}
		//�L�Xdeepcop��s��ArrayList���
		System.out.println("deepcop��s��ArrayList���:");
		for(int i=0;i<=4;i++){
			a.ShowDeepCopy(i); 
		}
		
	}

}
class MyStack extends ArrayList{
	ArrayList<Object> list = new ArrayList<Object>();//deep copy
	//�]���ϥ��~�� �GArrayList�w�q�L��method���ΦA�w�q
	public String getElement(int i){
		String x=get(i).toString();
		return x;
	}
	public void reverseDisplay(){//�ϧǨ��X��
		int x=size();//�j�p-1�����̫���ޭ�		
		//�qArrayList���X����
		for(int i=x-1;i>=0;i--){
			System.out.print(getElement(i)+",");
		}
	}
	/*deep copy*/
	public void DeepCopy(int i){
		String x=(get(i).toString());
		list.add(x);//���J�޼ƹ�������copy��1�ӷs��ArrayList
	}
	public void ShowDeepCopy(int x){
		System.out.print(list.get(x)+",");
	}

}
