import java.util.Scanner;

public class CU1156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a % 2 != 0)
			System.out.println("odd");
		else 
			System.out.println("even");
		
		sc.close();


	}

}
