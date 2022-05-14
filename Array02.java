public class Array02{
	public static void main(String[] agrs){
		int[] arr = {4,-1,9,10,23};
	
		int n = 0;
        int i = 0;
		for(i=0;i<arr.length;i++){
			if(arr[i] > n){
				n = arr[i];
			}
		}
		System.out.println("最大值" + n + "  下标=" + (i-1));
	}
}