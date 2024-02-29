import java.util.*;

public class CU1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r = ((n % 10) * 10 + (n / 10)) * 2;
		
		if(r > 100)
			r %= 100;
		
		System.out.println(r);
		
		if(r > 50)
			System.out.println("OH MY GOD");
		else
			System.out.println("GOOD");
		
		sc.close();

	}

}
