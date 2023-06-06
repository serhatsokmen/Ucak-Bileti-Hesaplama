import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        kullanıcıdan mesafe(KM), yaş ve yolculuk tipi (tek yön, gidiş dönüş) bilgileri alınacak.
        Mesafe başına ücret 0,10 tl / km
        mesafe ve yaş pozitif sayı, yolculuk tipi ise 1 veya 2. Aksi takdirde mesaj : HATALI VERI GIRDINIZ!
        12 yaşından küçükse bilet fiyatı üzerinden %50 indirim
        12-24 yaşları arasında ise bilet fiyatı üzerinden % 10 indirim
        65 yaşından büyük ise bilet fiyatı üzerinden % 30 indirim
        yolculuk tipi gidiş dönüş ise bilet fiyatı üzerinden % 20 indirim.


        NORMAL TUTAR : mesafe * 0.10
        YAŞ İNDİRİMİ : normal tutar * yaş indirim oranı
        İNDİRİMLİ TUTAR : Normal tutar - yaş indirimi
        GİDİŞ DÖNÜŞ BİLET İNDİRİMİ : indirimli tutar * 0.20


         */


        Scanner scan = new Scanner(System.in);


        int km,age,select;
        System.out.print("Mesafeyi giriniz : ");
        km = scan.nextInt();
        System.out.print("Yasinizi giriniz : ");
        age = scan.nextInt();

        System.out.println("Yolculuk tipini seciniz : 1 => Tek yon, 2 => Gidis Donus");
        select = scan.nextInt();
        double normalTutar = km * 0.10;
        double yasIndirimi,indirimliTutar,GDindirimi,total;

        switch(select) {
            case 1:
            if(age < 12) {
            yasIndirimi = normalTutar * 0.50;
            indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : "+indirimliTutar);

            }
            else if(age >= 12 && age <= 24) {
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : "+indirimliTutar);
            }
            else if(age > 65) {
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : "+indirimliTutar);
            }
            else {
                System.out.println("Toplam Tutar : "+normalTutar);
            }
            break;

            case 2:
                if(age < 12) {
                    yasIndirimi = normalTutar * 0.50;
                    indirimliTutar = normalTutar - yasIndirimi;
                    GDindirimi = indirimliTutar * 0.20;
                    total = (indirimliTutar - GDindirimi) * 2;
                    System.out.println("Toplam Tutar : "+total);
                }
                else if(age >= 12 && age <= 24) {
                    yasIndirimi = normalTutar * 0.10;
                    indirimliTutar = normalTutar - yasIndirimi;
                    GDindirimi = indirimliTutar * 0.20;
                    total = (indirimliTutar - GDindirimi) * 2;
                    System.out.println("Toplam Tutar : "+total);
                }
                else if(age > 65) {
                    yasIndirimi = normalTutar * 0.30;
                    indirimliTutar = normalTutar - yasIndirimi;
                    GDindirimi = indirimliTutar * 0.20;
                    total = (indirimliTutar - GDindirimi) * 2;
                    System.out.println("Toplam Tutar : "+total);
                }
                else {
                    // yaş indirimi yok sadece gd indirimi var. o da 0.20
                    total = (normalTutar - (normalTutar * 0.20)) * 2;
                }
                break;

            default:
                System.out.println("Hatali Veri Girdiniz!");
                break;
        }



    }
}