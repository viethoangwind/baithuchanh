import java.util.Scanner;

public class Hinhtru {
    final float Pi = 3.14f;
    float r;
    float h;
    float dientich, chuvi, thetich;
    Scanner sc = new Scanner(System.in);

    public void nhapbankinh() {
        System.out.print("Nhap ban kinh r=");
        r = sc.nextFloat();

    }

    public void nhapchieucao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao h=");
        h = sc.nextFloat();
        sc.close();
    }

    public void tinhchuvi() {
        chuvi = 2 * r * Pi * h;
    }

    public void tinhdientich() {
        dientich = 2 * r * r * Pi + 2 * Pi * r * h;
    }

    public void tinhthetich() {
        thetich = r * r * Pi * h;
    }

    public void inthongtin() {
        System.out.printf("Hinh tru duong tron ban kinh %f, chieu cao %f co chu vi = %f", r, h, chuvi);
        System.out.printf("\nHinh tru duong tron ban kinh %f, chieu cao %f co dientich = %f", r, h, dientich);
        System.out.printf("\nHinh tru duong tron ban kinh %f, chieu cao %f co thetich = %f", r, h, thetich);
    }

}