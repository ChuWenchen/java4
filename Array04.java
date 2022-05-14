public class Array04{
	public static void main(String[] agrs){
		int[] arr = {1,2,3,4,5};
		int left = 0;
		int right = arr.length - 1;
		int mid = 0; // 中间变量
		while(left < right){
			mid = arr[left];
			arr[left] = arr[right];
			arr[right] = mid;
			left++;
			right--;
		}
		for(int i = 0 ; i<arr.length; i++){
		    System.out.print(arr[i] + "  ");
	    }
	}
}