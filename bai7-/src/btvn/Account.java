package btvn;
//•	Lớp Account lưu thông tin về tài khoản: accountNo, customerName, balance (các trường có bổ từ truy cập là protected).
// Tạo các phương thức constructors phù hợp, tạo các phương thức setter cho các trường
//•	Lớp PersonAccount kế thừa từ lớp Account có thêm thông số fee(phí giao dịch),
// tạo các phương thức constructor phù hợp và gọi constructor lớp cha xuống. Tạo phương thức withDraw() rút tiền và deposite() gửi tiền.
// Tạo phương thức setter và getter cho các trường. Ghi đè phương thức toString trả về toàn bộ thông tin tài khoản.
//•	Tạo lớp SavingAccount kế thừa từ Account bổ sung thêm 2 trường: rate(% lãi suất) và period (kỳ hạn).
// tạo các phương thức constructor phù hợp và gọi constructor lớp cha xuống, tạo phương thức setter và getter cho các trường, tạo phương thức getRate() để trả về lãi suất theo kỳ hạn:
//Period 	Rate
//1 	5%
//3 	5.5%
//6 	6%
//12 	7%
//24 	7.5%
//36 	8%
//Còn lại 1.8%
//•	Tạo phương thức checkInterest() in ra lãi được hưởng sau period tháng.
//•	Ghi đè phương thức toString trả về toàn bộ thông tin tài khoản.
//•	Viết code cho hàm main trong lớp App để kiểm thử ứng dụng
public class Account {
    private String accountNo;
    private String customerName;
    private  double balance;

    public Account() {
    }



    public Account(String accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    ghi de cua lop object the hien tinh da hinh cua doi tuong
//    ghi lai phiuong thuc cua lop cha.Phai cung ten,so luong tham so,kieu so luong
    @Override
    public String toString() {
        return "Account [accountNo= "+accountNo+", customerName= "+customerName+", balance= "+balance+"]";
    }

}

