import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        int[] numbers = {0, 0, 0};
        int dummy;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println((i+1)+". Sayıyı Giriniz.");
            numbers[i] = scanner.nextInt();
        }

        for (int j = 0; j < 2; j++) {
            for (int k = j + 1; k < 3; k++) {
                if (numbers[j] > numbers[k]) {
                dummy=numbers[k];
                numbers[k]=numbers[j];
                numbers[j]=dummy;
                }
            }
        }

        System.out.println(numbers[0]+"<"+numbers[1]+"<"+numbers[2]);

    }
}
