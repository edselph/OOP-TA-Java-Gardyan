import java.util.Scanner;
public class Prime {
  public static void main(String[] args){
    int num;
    boolean prime = true;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1-9 to check Prime");
    num = input.nextInt();
    input.close();


    if(num < 1)
      System.out.println("Number need be greater than 1");
    else if(num == 1)
      System.out.println("1 is not a prime or even composite");
    else{
      for(int i = 2; i<= (num/2); i++){
        if((num % i)== 0){
          prime = false;
          break;
        }
      }
    }
    if(prime)
    System.out.printf("% is a prime num",num);
    else
    System.out.printf("% not a prime", num);
  }
}
