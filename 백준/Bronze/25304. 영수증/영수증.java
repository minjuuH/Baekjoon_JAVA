import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt(); int N = scanner.nextInt();
		int x=0, a, b;
		
		for(int i=0;i<N;i++) {
			a = scanner.nextInt(); b = scanner.nextInt();
			x+=(a*b);
		}
		
		if(X==x)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}