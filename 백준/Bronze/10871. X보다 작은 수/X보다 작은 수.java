import java.util.ArrayList;
import java.util.Scanner;
//no10871
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int X = scanner.nextInt();
		int n[] = new int[N];
		ArrayList<Integer> min = new ArrayList<>();
		int i;
		for(i=0; i<N; i++) {
			n[i] = scanner.nextInt();
			if(n[i]<X)
				min.add(n[i]);
		}
		
		for(i=0; i<min.size(); i++)
			System.out.print(min.get(i)+" ");
	}
}