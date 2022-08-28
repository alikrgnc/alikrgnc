import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        //değişkenlerimizi yazalim

        int yas,yolculukTip;
        double mesafe,tutar,toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Yaşinizi giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini secin\n1-tekyon : \n2-gidis-donus : ");
        yolculukTip = input.nextInt();
        //koşullarımıza başlayalım

        if(mesafe<1){
            System.out.println("Mesafeyi tekrar giriniz!");
            System.exit(0);

        } if (yas<1){
            System.out.print("Hatalı yaş girdiniz");
        }if((yolculukTip != 1) && (yolculukTip !=2)){
            System.out.print("Hatalı seçim yaptınız!lütfen tekrar seçin : ");

        }
        //Toplam tutarı yansıtalım, son fiyatıda indirimle dahil

        tutar = mesafe*0.10;
        toplamTutar = tutar;

        if (yas<12){
            toplamTutar = (tutar-(tutar*0.5));

        }else if((yas>12) && (yas<24)) {
            toplamTutar = (tutar-(tutar*0.1));


        }else if ((yas>65)){
            toplamTutar = (tutar-(tutar*0.3));
        }
        if (yolculukTip ==2){
            toplamTutar = (toplamTutar -(toplamTutar* 0.20));
        }
        System.out.println("Toplam tutar : "+ toplamTutar);



    }
}
