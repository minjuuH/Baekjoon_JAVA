import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int a , b;
		
		for(int i=0;i<T;i++) {
			a = scanner.nextInt(); b = scanner.nextInt();
			System.out.printf("Case #%d: %d\n", (i+1), a+b);
		}	
	}
}