public class Array05{
	public static void main(String[] agrs){
		int[] arr = {1,2,3,4,5};
		int l = arr.length;
		int[] arr2 = new int[l];
		for(int i = l-1,j = 0; i>=0; i--,j++){
				arr2[j]=arr[i];
		}
		arr = arr2;
		for(int i = 0; i<l;i++){
			System.out.print(arr[i] + "  ");
		}
	}
}