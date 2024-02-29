package baitap1;

import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            Product product=new Product();
            do {
//                  hien thi menu
                System.out.println("*****MENU*****");
                System.out.println("1.Nhập vào thông tin sản phâm");
                System.out.println("2.Hiển thị thông tin");
                System.out.println("3.Hiển thị lãi xuất");
                System.out.println("4.Thoát");
                System.out.println("Hãy chọn chức năng ");
                int choice= scanner.nextInt();
                switch (choice){
                    case 1:
                        product.productInfo();
                        break;
                    case 2:
                        product.showProduct();
                        break;
                    case 3:
                        System.out.println("Lai xuat san pham la "+product.laiXuat());
                        break;
                    case 4:
                        System.out.println("thoat chuong trinh");
                        break;
                    default:
                        System.out.println("vui long chon lai");
                }
            }while(true);

//

        }

    }
