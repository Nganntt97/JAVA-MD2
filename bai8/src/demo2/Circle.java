package demo2;

import java.util.Scanner;

public class Circle extends Shape {
    private double bankinh;

    public Circle() {
    }

    public Circle(double bankinh) {
        this.bankinh = bankinh;
    }

    public Circle(String color, double bankinh) {
        super(color);
        this.bankinh = bankinh;
    }
    @Override
    public void getArea(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao ban kinh");
        bankinh=Integer.parseInt(scanner.nextLine());
        double s=Math.PI*bankinh*bankinh;
        System.out.println("dien tich hinh tron "+s);
    }
}
