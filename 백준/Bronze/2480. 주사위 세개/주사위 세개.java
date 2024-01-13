import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dice[] = new int[3]; int max=0;
		
		for(int i=0;i<3;i++) {
			dice[i] = scanner.nextInt();
			if(dice[i]>max)
				max = dice[i];
		}
		if (dice[0]==dice[1] && dice[1]==dice[2])
			System.out.println(10000+(dice[0]*1000));
		else if (dice[0]==dice[1] || dice[1]==dice[2])
			System.out.println(1000+(dice[1]*100));
		else if (dice[0]==dice[2])
			System.out.println(1000+(dice[0]*100));
		else
			System.out.println(max*100);
	}	
}