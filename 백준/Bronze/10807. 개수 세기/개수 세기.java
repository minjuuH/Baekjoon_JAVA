import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int n[] = new int[N];
		int i;
		for(i=0; i<N; i++)
			n[i] = scanner.nextInt();
		int v = scanner.nextInt();
		
		int count=0;
		for(i=0;i<N;i++) {
			if(n[i]==v)
				count+=1;
		}
		System.out.println(count);
	}
}