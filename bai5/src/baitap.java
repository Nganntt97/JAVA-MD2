import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class baitap {
    public static void main(String[] args) {
//        viet chuiong trinh quan kly thong tin cua sinh vien
//        1.ma sinh vien
//        2.ho ten
//        3.sodienthoai
//        ngay thang nam sinh
//        5 in thong tin sinh vien
//        validate duwx lieeu cho
//        phone dung dinh dang dong lao
//        email
//        ma sinh vien phai bat dau bang chu B va co 3 so ow sau
//        ho ten ko chua ky tu dac biet tru khoang trang
//        nam sinh
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap thong tin");
        String id,fullName,phone,birthDate;
        do {
            System.out.println("Hay nhap ma sinh vien");
            id= scanner.nextLine();
            Pattern patternid=Pattern.compile("B[0-9]{3}");
            Matcher check= patternid.matcher(id);
            if (check.matches()) {
                break;
            }else {
                System.err.println("sai ma so sinh vien, hay nhap lai");
            }

        }while (true);

        do {
            System.out.println("hãy nhập họ tên");
             fullName=scanner.nextLine();
            Pattern patternfullName=Pattern.compile("[a-z A-Z]+\\s?[a-z A-Z]*");
            Matcher check=patternfullName.matcher(fullName);
            if (check.matches()){
                System.out.println("ok");
                break;

            }else {
                System.err.println("vui lòng nhập đúng họ tên");
            }
        }while (true);
        do {
            System.out.println("Hãy nhập số điện thoại");
            phone=scanner.nextLine();
            Pattern patternphone=Pattern.compile("84|0[3|5|7|8|9]+[0-9]{8}");
            Matcher check=patternphone.matcher(phone);
            if (check.matches()){
                break;
            }else {
                System.err.println("vui lòng nhập đúng số điện thoại");
            }
        }while(true);
        do {
            System.out.println("Hãy nhâp ngày tháng năm sinh");
             birthDate=scanner.nextLine();
            Pattern patternbirthDate=Pattern.compile("\\d{2}\\d{2}\\d{4}");
            Matcher check= patternbirthDate.matcher(birthDate);
            if (check.matches()) {
                break;
            }else {
                System.err.println("vui lòng nhập đúng định dạng");
            }
        }while(true);
//        in thong tin
        System.out.println("Thông tin sinh viên");
        System.out.println("ma so sinh vien "+id);
        System.out.println("Ho ten "+fullName);
        System.out.println("số điện thoại "+phone);
        System.out.println("Ngày tháng năm sinh "+birthDate);



    }
}
