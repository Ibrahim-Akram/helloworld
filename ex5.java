public class ex5{
	public static void main(String[] args) {
		int pro = 1;
		final int lowbon=1;
		final int uppbon=10;
		for(int num=lowbon; num<=uppbon; num++) {
			pro+=num;
		} 
		System.out.println(pro);
	}
}