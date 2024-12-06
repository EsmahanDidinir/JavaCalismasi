import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int x;
        Scanner answer = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        x = answer.nextInt();

        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("Artık Yıldır.");
        } else {
            System.out.println("Artık Yıl Değildir.");
        }
    }
}
