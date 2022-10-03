public class ex4{
	public static void main(String[] args) {
		int sum = 0;
		double ave;
		final int lowbon=1;
		final int uppbon=100;
		for(int num=lowbon; num<=uppbon; num++) {
			sum+=num;
		} 
		ave=sum/uppbon;
		System.out.println(sum);
		System.out.println(ave);
	}
}