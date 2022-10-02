import java.util.Scanner;

public class harmonik_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double harmonicTotal=0;
        System.out.print("Harmonik serisini bulmak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            harmonicTotal += (1.0/i);
        }

        System.out.println("Girdiğiniz sayının harmonik serisi:  " + harmonicTotal);


    }
}
