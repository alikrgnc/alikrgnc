import java.util.Scanner;

public class cinZodiac {
    public static void main(String[] args) {

        int ay,burc;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz : ");
        ay = input.nextInt();
        burc = ay % 12;


        switch (burc) {
            case 0 :
                System.out.print("Zodiac sign : monkey");
                break;
            case 1 :
                System.out.print("Zodiac sign : Horoz");
                break;
            case 2 :
                System.out.print("Zodiac sign : Kopek");
            case 3 :
                System.out.print("Zodiac sign : Domuz");
                break;
            case 4 :
                System.out.print("Zodiac sign : Fare");
                break;
            case 5 :
                System.out.print("Zodiac sign : Öküz");
                break;
            case 6 :
                System.out.print("Zodiac sign : Kaplan");
                break;
            case 7 :
                System.out.print("Zodiac sign : Tavşan");
                break;
            case 8 :
                System.out.print("Zodiac sign : Ejderha");
                break;
            case 9 :
                System.out.print("Zodiac sign : Yılan");
                break;
            case 10 :
                System.out.print("Zodiac sign : At");
                break;
            case 11 :
                System.out.print("Zodiac sign : Koyun");
                break;

        }
    }
}
