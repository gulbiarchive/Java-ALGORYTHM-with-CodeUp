import java.util.*;

public class CU1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch(a) {
		case 1:
			a = 400;
			break;
		case 2:
			a = 340;
			break;
		case 3:
			a = 170;
			break;
		case 4:
			a = 100;
			break;
		case 5:
			a = 70;
			break;
		}
		
		switch(b) {
		case 1:
			b = 400;
			break;
		case 2:
			b = 340;
			break;
		case 3:
			b = 170;
			break;
		case 4:
			b = 100;
			break;
		case 5:
			b = 70;
			break;
		}
		
		if(a + b > 500)
			System.out.println("angry");
		else
			System.out.println("no angry");

	}

}
