import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı girin : ");
        yil = input.nextInt();
        if (yil%400 == 0){
            if (yil%100 == 0){
                if (yil%4 == 0){
                    System.out.print("Artik bir yıldır");
                }

            }
        }else {
            System.out.print("Artik bir yıl degildir");
        }
    }

}
