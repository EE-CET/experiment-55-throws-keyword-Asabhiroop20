import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {
    
    static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException();
        } else {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        try {
            check(n);
        } catch (IOException e) {
            System.out.print("Caught: IO Exception");
        }
    }
}
