import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int n[] = new int[N]; int max=0, min=0;
		for(int i=0; i<N; i++)
			n[i] = scanner.nextInt();
		
		Arrays.sort(n);
		System.out.printf("%d %d", n[0], n[n.length-1]);
	}
}