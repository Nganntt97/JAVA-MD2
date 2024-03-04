package btvn;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PartTimeEmployee partTimeEmployee=new PartTimeEmployee("a",50,7);
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("n",70);
        System.out.println("nhap ten nhan vien");
        partTimeEmployee.setName(scanner.nextLine());
        System.out.println("nhao tien luong 1 gio");
        partTimeEmployee.setPaymentPerHour(Integer.parseInt(scanner.nextLine()));
        System.out.println("nhap so gio lam viec");
        partTimeEmployee.setWorkingHours(Integer.parseInt(scanner.nextLine()));

        System.out.println("tien luong parttime");
        System.out.println("Name "+partTimeEmployee.getName());
        System.out.println("salary "+partTimeEmployee.calculateSalary());

        System.out.println("nhap ten nhan vien");
        fullTimeEmployee.setName(scanner.nextLine());
        System.out.println("nhap tien luong 1 gio");
        fullTimeEmployee.setPaymentPerHour(Integer.parseInt(scanner.nextLine()));

        System.out.println("tien luong fulltime");
        System.out.println("Name "+fullTimeEmployee.getName());
        System.out.println("salary "+fullTimeEmployee.calculateSalary());
    }
}
