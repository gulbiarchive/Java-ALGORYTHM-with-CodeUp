import java.util.Scanner;

public class CU1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a < 10)
			System.out.println("small");
		else
			System.out.println("big");
		
		sc.close();

	}

}
