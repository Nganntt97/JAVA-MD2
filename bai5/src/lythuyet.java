public class lythuyet {
    public static void main(String[] args) {
//        cac phuong thuc lam viec cua string
//        do dai
        String fullName="Nguyen thi thuy ngan";
        System.out.println(fullName.length());
//        phuong thuc chart tra ve 1 ky tu or index
        System.out.println(fullName.charAt(8));
//       concat noi chuoi
        System.out.println(fullName.concat("xinh gai"));
        System.out.println(fullName);
//        upCase towCase chuyen chu hoa thanh chu thuong va nguoc lai
        System.out.println(fullName.toUpperCase());
        String msv=" 43435 ";
//        chi duoc 5 ky tu
//        trim phuong thuc loai bo khoang trang giua 2 dau
        System.out.println(msv.length());
        System.out.println(msv.trim().length());
//
        String address="atsushi";
        System.out.println(fullName.equals(address));

}
}
