import java.util.*;

public class zoo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int y = 0;
    System.out.println("Enter the String:");
    String s = sc.nextLine();
    char[] z = s.toCharArray();

    for (int i = 0; i < z.length; i++) {
      if (z[i] == 'z') {
        x = x + 1;
      } else {
        y = y + 1;
      }
    }

    if (2 * x == y) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}