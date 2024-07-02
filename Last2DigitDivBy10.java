import java.util.Scanner;

public class Last2DigitDivBy10 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Enter the size of an array:
    System.out.println("Enter the size of an array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int b[] = new int[n];

    // Enter the elements in the array
    System.out.println("Enter the elements of an array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      b[i] = arr[i] % 10;
    }

    if (b[n - 1] == 0)
      System.out.println("Yes");
    else
      System.out.println("No");

  }

}