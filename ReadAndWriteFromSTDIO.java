import java.util.Scanner;

public class ReadAndWriteFromSTDIO {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int N = sc.nextInt();

    System.out.println("Enter the string:");
    String S = sc.next();

    System.out.println("Output:");
    System.out.println(N * 2);
    System.out.println(S);
  }

}