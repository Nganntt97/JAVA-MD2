package demo2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("*****MENU***");
            System.out.println("1.Mau cua hinh chu nhat ");
            System.out.println("2.Mau cua hinh tron");
            System.out.println("3.dien tich hinh chu nhat");
            System.out.println("4.dien tich cua hinh tron");
            System.out.println("5.dung chuong trinh");
            System.out.println("hay chon chuc nang");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhap mau cua hinh chu nhat");
                    rectangle.setColor(scanner.nextLine());
                    System.out.println("mau cua hinh chu nhat la "+rectangle.getColor());
                    break;
                case 2:
                    System.out.println("nhap mau cua hinh tron");
                    circle.setColor(scanner.nextLine());
                    System.out.println("mau cua hinh tron la "+circle.getColor());
                    break;
                case 3 :
                    rectangle.getArea();
                    break;
                case 4 :
                    circle.getArea();
                    break;
                case 5 :
                    System.exit(0);
                default:
                    System.out.println("hay chon dung  tu 1-5");

            }
        }while (true);


    }
}
