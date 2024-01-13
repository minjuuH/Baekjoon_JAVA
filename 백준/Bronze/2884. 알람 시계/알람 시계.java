import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt(); int M = scanner.nextInt();
		M -= 45;
		if (M>=0)
			System.out.println(H+" "+M);
		else {
			if (H==0)
				System.out.println(23+" "+(60+M));
			else
				System.out.println(H-1+" "+(60+M));
		}
	}
}