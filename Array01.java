public class Array01{
	public static void main(String[] agrs){
		int i = 0;
		char[] arr = new char[26];
		for(i=0;i<26;i++){
			arr[i] = (char)('A' + i);  // 'A' + i ÊÇintÀàÐÍ
			System.out.print(arr[i] + " ");
		}
	}
}