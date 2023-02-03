import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması.

        int dogumyili,sonuc;

        //Bilgi girişi yapılma işlemi.

        Scanner input=new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili=input.nextInt();

        //Çin Zodyağı burcu karşılaştırma işlemi ve sonucu.

        sonuc=dogumyili%12;

        if(sonuc==0) {
            System.out.println("Çin zodyağı burcunuz:MAYMUN (" + sonuc + ")");
            }

        else if (sonuc==1) {
            System.out.println("Çin zodyağı burcunuz:HOROZ (" + sonuc + ")");
            }

        else if (sonuc==2) {
            System.out.println("Çin zodyağı burcunuz:KÖPEK (" + sonuc + ")");
            }

        else if (sonuc==3) {
            System.out.println("Çin zodyağı burcunuz:DOMUZ (" + sonuc + ")");
            }

        else if (sonuc==4) {
            System.out.println("Çin zodyağı burcunuz:FARE (" + sonuc + ")");
        }

        else if (sonuc==5) {
            System.out.println("Çin zodyağı burcunuz:ÖKÜZ (" + sonuc + ")");
            }

        else if (sonuc==6) {
            System.out.println("Çin zodyağı burcunuz:KAPLAN (" + sonuc + ")");
            }

        else if (sonuc==7) {
            System.out.println("Çin zodyağı burcunuz:TAVŞAN (" + sonuc + ")");
            }

        else if (sonuc==8) {
            System.out.println("Çin zodyağı burcunuz:EJDERHA (" + sonuc + ")");
            }

        else if (sonuc==9) {
            System.out.println("Çin zodyağı burcunuz:YILAN (" + sonuc + ")");
            }

        else if (sonuc==10) {
            System.out.println("Çin zodyağı burcunuz:AT (" + sonuc + ")");
            }

        else if (sonuc==11) {
            System.out.println("Çin zodyağı burcunuz:KOYUN (" + sonuc + ")");
            }
            }
        }
