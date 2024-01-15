import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int M = scanner.nextInt();
		int basket[] = new int[N];
		for (int i=0; i<N; i++)
			basket[i]=i+1;
		
		int i, j, n;
		
		for (int l=0; l<M; l++) {
			i = scanner.nextInt()-1; j = scanner.nextInt()-1;
			while(i<j) {
				n=basket[i]; basket[i++]=basket[j]; basket[j--]=n;
			}
		}
		scanner.close();
		
		for (int idx=0; idx<N; idx++)
			System.out.printf("%d ", basket[idx]);
	}
}