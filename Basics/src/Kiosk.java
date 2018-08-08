import java.util.Scanner;

public class Kiosk {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int input2 = scan.nextInt();
		Calculator EmmaCalculator = new Calculator(); 	
		Calculator SyshelleCalculator = new Calculator();

		int addingEmmaCalculator = EmmaCalculator.adding (input, input2);
		System.out.println(addingEmmaCalculator);

		int addingSyshelleCalculator = SyshelleCalculator.adding(input, input2);
		System.out.println(addingSyshelleCalculator);
	}
}
