import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=0, sum=0;
		
		for (int i=0; i<5; i++) {
			num = scanner.nextInt();
			sum += num*num;
		}
		
		System.out.println(sum%10);
	}
}