import java.util.Scanner;
public class arrayAdd{
	public static void main(String[] agrs){
		int[] arr = {1,2,3};
		System.out.println("�Ƿ���� y/n");
		Scanner myScanner = new Scanner(System.in);
		char put = myScanner.next().charAt(0);
		while(put == 'y'){

			int[] arr2 = new int[arr.length+1]; // ��������������һ��Ԫ��
			for(int i = 0; i<arr.length; i++){   // �����鸳ֵ��������
				arr2[i] = arr[i];
			}
			arr2[arr2.length-1] = (char)(arr[arr.length-1] + 1); // ���������һ��Ԫ�ؼ�һ����ֵ�����������һ��Ԫ�أ��ﵽ���ݵ�Ŀ��
			arr = arr2;   // ������ָ��������
			for(int j = 0; j<arr.length; j++){   // �������
				System.out.print(arr[j] + "  ");
			}
			System.out.println("�Ƿ���� y/n");
			put = myScanner.next().charAt(0);
        }

	}
}