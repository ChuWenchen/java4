public class moreFor05{
	public static void main(String[] agrs){
        int i = 1;
        int sum = 0; //  ×ÜºÍ
		for(i=1;i<=100;i++){
			int j = 1;
			for(j=1;j<=i;j++){
				sum += j;
			}
		}
		System.out.println(sum);
	}
}