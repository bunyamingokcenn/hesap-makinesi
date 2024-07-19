import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, choise, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("HESAP MAKİNESİNE HOŞGELDİNİZ");
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:\n1-Toplama işlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme işlemi\n");
        choise = input.nextInt();

        if (choise == 1 || choise == 2 || choise == 3 || choise == 4 ) {

            System.out.print("Birinci sayıyı giriniz: ");
            number1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            number2 = input.nextInt();

            switch (choise){
                case 1:
                    //Toplama İşlemi
                    toplam = (number1 + number2);
                    System.out.println("Toplama işlemi sonucu: " + toplam);
                    break;
                case 2:
                    //Çıkarma İşlemi
                    toplam = (number1 - number2);
                    System.out.println("Çıkarma işlemi sonucu: " + toplam);
                    break;
                case 3:
                    //Çarpma İşlemi
                    toplam = (number1 * number2);
                    System.out.println("Çarpma işlemi sonucu: " + toplam);
                    break;
                case 4:
                    //Bölme İşlemi
                    if (number1 == 0 ){
                        System.out.println("Sıfır bölünemez ");
                    } else if (number2 == 0 ) {
                        System.out.println("Bir sayı sıfıra bölünemez");

                    }else {
                        toplam = (number1 / number2);
                        System.out.println("Bölme işlemi sonucu: " + toplam);

                    }
                    break;
            }

        } else {
            System.out.println("Hatalı işlem seçimi yaptınız");
        }



    }
}