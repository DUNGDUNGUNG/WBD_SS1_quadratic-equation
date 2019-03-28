import java.util.Scanner;

public class PhuongtrinhB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();
        if(a==0){
            double x = -b/c;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }else{
            double penta=(b*b)-(4*a*c);
            if(penta == 0){
                System.out.println("phuong trinh co mot nghiem kep x1 = x2 = " +(-b/(2*a)));
            }else if(penta>0){
                System.out.println("phuong trinh co hai nghiem: "+ "x1 = " +((-b + Math.sqrt(penta))/(2*a)) + "; x2 = " + ((-b - Math.sqrt(penta))/(2*a)));

            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
