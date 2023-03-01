import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double alan,a,r,pi=3.14;

        Scanner inp= new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz :");
        r=inp.nextDouble();
        System.out.print("Dairenin merkez açısını giriniz :");
        a=inp.nextDouble();
        alan=(pi*(r*r)*a)/360;


        System.out.println("Dairenin alanı :"+alan);




    }
}