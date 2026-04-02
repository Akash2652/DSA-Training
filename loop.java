import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("hello world");
        }
        in.close();
    }
}
