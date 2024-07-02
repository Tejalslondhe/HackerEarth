import java.util.Scanner;

public class MaxElemThanX {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements in the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Array is:");
    for (int i = 0; i < n; i++) {

      System.out.print(arr[i] + " ");
    }

    System.out.println();
    System.out.println("Enter number");
    int num = sc.nextInt();

    int cnt = 0;
    System.out.println("Elements greater that " + num + " are:");
    for (int i = 0; i < n; i++) {
      if (arr[i] > num) {
        cnt++;
        System.out.print(arr[i] + " ");
      }

    }
    System.out.print("\nTotal elements greater than " + num + " are:" + cnt);

  }

}