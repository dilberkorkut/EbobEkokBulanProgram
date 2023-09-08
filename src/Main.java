import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz(kucuk olan sayi): ");
        int n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1 ;

        for(int i=1; i<=n1; i++ ) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("Ebob: " +i);
                ebob = i;
            }
        }

        System.out.println("---------------");

        for(int k = n1; k >= 1; k--) {
            if (n1%k == 0 && n2%k == 0){
                ebob = k;
                System.out.println("Ebob: " +ebob);
                break;
            }
        }

        System.out.println("---------------");

        for(int j = 1; j <= (n1*n2); j++) {
            if (j%n1 == 0 && j%n2 == 0){
                System.out.println("Ekok:" + j);
                break;
            }
        }

        System.out.println("---------------");

        for(int m = 1; m <= (n1*n2); m++) {
            if (m%n1 == 0 && m%n2 == 0){
                int ekok = (n1*n2)/ebob;
                System.out.println("Ekok : " +ekok);
                break;
            }
        }

    }
}