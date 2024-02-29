package baitap1;

import java.util.Scanner;



//    Tạo Lớp Product chứa thông tin mã sản phẩm, tên sản phẩm, giá bán , giá nhập
//
//1 contructor không tham số
//1 contructor Đầy đủ tham số
//getter và setter đầy đủ
//1 phương thức nhập thông tin sản phẩm
//1 hiển thị thông tin sản phẩm
//1 phương thức tính lãi xuât (lai xuat = giá bán - giá nhập)
//
//Tạo lớp Test
//có main
//    có menu
//    =============MEnu===========
//
//Nhập vào thông tin sản phâm
//Hiển thị thông tin
//Hiển thị lãi xuất
class Product{
    private String maSanpham;
    private String productName;
    private double giaBan;
    private double giaNhap;

    //    contructor ko tham so
    public Product(){
    }
    //contrusctor cos tham so
    public Product(String maSanpham,String productName,double giaBan,double giaNhap){
        this.maSanpham=maSanpham;
        this.productName=productName;
        this.giaBan=giaBan;
        this.giaNhap=giaNhap;

    }

    public String getMaSanpham() {

        return maSanpham;
    }

    public void setMaSanpham(String maSanpham) {
        this.maSanpham = maSanpham;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    //    nhap thong tin
    public void productInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm");
        this.maSanpham= scanner.nextLine();
        System.out.println("Nhap ten san pham");
        this.productName= scanner.nextLine();
        System.out.println("nhap gia ban");
        this.giaBan= scanner.nextDouble();
        System.out.println("nhap gia nhap vao");
        this.giaNhap= scanner.nextDouble();
    }
    public void showProduct(){
        System.out.println("Ma san pham "+this.maSanpham);
        System.out.println("Ten san pham "+this.productName);
        System.out.println("gi ban "+ this.giaBan);
        System.out.println("gia nhap vao "+ this.giaNhap);
    }

    public double laiXuat(){
        return this.giaBan-this.giaNhap;
    }

}

