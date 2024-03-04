package demo2;

//   Ở bài này, chúng ta sẽ tạo abstract class tên là Shape có các thuộc tính : color ,
//   các phương thức get/set, các construtor,
//   1 phương thức trừu tượng tính diện tích là getArea(),
//   phương thức display() để hiển thị màu sắc của hình đó.
//b.    2 lớp con là Rectangle và Circle kế thừa abstract class Shape và triển khai phương thức getArea() để tính diện tích tương ứng.
// Ngoài ra các lớp con cũng có các thuộc tính riêng như bán kính trong Circle hay width, height trong Rectangle.
//c.    Tạo lớp Main , tạo các đối tượng từ các lớp đã xây dựng và gọi phương thức getArea() để thực hiện tính diện tích và in ra màn hình, kiểm tra kết quả thu được.
public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void getArea();
    public void display() {
        System.out.println("color " + color);
    }
}
