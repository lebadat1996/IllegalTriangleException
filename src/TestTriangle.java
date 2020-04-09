import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = scanner.nextInt();
        System.out.print("enter b: ");
        int b = scanner.nextInt();
        System.out.print("enter c: ");
        int c = scanner.nextInt();
        try {
            Triangle triangle = new Triangle(a, b, c);
            System.out.print("Day la tam giac");
        } catch (Exception e) {
            e.getStackTrace() ;
            System.out.print("Exception " + " Xin moi nhap lai !!");
        }


    }
}
