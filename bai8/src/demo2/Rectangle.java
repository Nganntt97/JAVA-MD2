package demo2;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double chieuCao;
    private double chieuRong;

    public Rectangle() {
    }

    public Rectangle(String color, double chieuCao, double chieuRong) {
        super(color);
        this.chieuCao = chieuCao;
        this.chieuRong = chieuRong;
    }

    @Override
    public void getArea(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap chieu cao");
        chieuCao=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chieu rong");
        chieuRong=Integer.parseInt(scanner.nextLine());
        double s=chieuRong*chieuCao;
        System.out.println("dien tich hinh chu nhat "+s);
    }

}
