import java.util.*;
public class CU1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a >= 90)
			System.out.println("A");
		else if(a >= 70)
			System.out.println("B");
		else if(a >= 40)
			System.out.println("C");
		else
			System.out.println("D");
		
		sc.close();

	}

}
