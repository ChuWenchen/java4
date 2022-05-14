import java.util.Scanner;
public class arrayAdd{
	public static void main(String[] agrs){
		int[] arr = {1,2,3};
		System.out.println("是否添加 y/n");
		Scanner myScanner = new Scanner(System.in);
		char put = myScanner.next().charAt(0);
		while(put == 'y'){

			int[] arr2 = new int[arr.length+1]; // 新数组比老数组多一个元素
			for(int i = 0; i<arr.length; i++){   // 老数组赋值给新数组
				arr2[i] = arr[i];
			}
			arr2[arr2.length-1] = (char)(arr[arr.length-1] + 1); // 老数组最后一个元素加一，赋值给新数组最后一个元素，达到扩容的目的
			arr = arr2;   // 老数组指向新数组
			for(int j = 0; j<arr.length; j++){   // 输出数组
				System.out.print(arr[j] + "  ");
			}
			System.out.println("是否添加 y/n");
			put = myScanner.next().charAt(0);
        }

	}
}