import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int[9];
		int max=0, index=0;
		for(int i=0; i<9; i++) {
			n[i] = scanner.nextInt();
			if (n[i]>max) {
				max = n[i];
				index = i+1;
			}
		}
			
		System.out.printf("%d\n%d", max, index);
	}
}