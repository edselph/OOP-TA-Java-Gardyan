import java.util.Scanner;
public class Exercise1 {
  public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int x = sc.nextInt();
		sc.nextLine();
		if (x % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
