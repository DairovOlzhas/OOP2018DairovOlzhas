import java.util.Scanner;

public class Easy5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
    }
}
