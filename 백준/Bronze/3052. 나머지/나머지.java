import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		int cnt=10;
		
		for(int i=0; i<10; i++) {
			num[i] = scanner.nextInt()%42;
			for(int j=0; j<i; j++) {
				//System.out.println(num[j]);System.out.println(num[i]);
				if(num[i]==num[j]) {
					cnt--;
					break;
				}	
			}
		}
		System.out.println(cnt);
	}
}