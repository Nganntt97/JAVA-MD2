public class lythuyet2 {
    public static void main(String[] args) {
//        them chuoi
        StringBuilder stringBuilder=new StringBuilder("torihara");
//        System.out.println(stringBuilder.append(" kirin"));
//        chen them nd vao dung insert
        stringBuilder.insert(7," atsushi");
        System.out.println(stringBuilder);
//        chuyen sang string
      String fullName=  stringBuilder.toString();
        System.out.println(fullName.concat("ko"));
        System.out.println(fullName);
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer=new StringBuffer("atsushi");
//        System.out.println(stringBuffer.append(" x"));
//        stringBuffer.delete(0,1);
//        System.out.println(stringBuffer);
//        phuong thuc tra ve dung luong
        System.out.println(stringBuffer.capacity());



    }
}
