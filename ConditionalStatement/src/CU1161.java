import java.util.*;

public class CU1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a % 2 == 0)
			System.out.print("짝수+");
		else
			System.out.print("홀수+");
		

		if(b % 2 == 0)
			System.out.print("짝수=");
		else
			System.out.print("홀수=");
		

		if((a + b) % 2 == 0)
			System.out.print("짝수");
		else
			System.out.print("홀수");
		
		sc.close();
	}

}
