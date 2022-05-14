public class Array03{
	public static void main(String[] agrs){
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i<arr1.length; i++){
			arr2[i] = arr1[i];
		}
		arr2[0] = 10;
		for(int i = 0; i<arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		for(int i = 0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}

	}
}