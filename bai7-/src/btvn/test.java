package btvn;

public class test {
    public static void main(String[] args) {
        PersonAccount personAccount = new PersonAccount("060597","N",10000,30);
        personAccount.withDraw(400);
        personAccount.deposit(600);
        System.out.println("Thong tin nguoi gui: "+personAccount);
        SavingAccount savingAccount = new SavingAccount("060886","A",9000,0,5);
        savingAccount.setRate(6.5);
        System.out.println("Thong tin gui tiet kiem: "+savingAccount);
        System.out.println("Lai suat sau 12 thang: "+savingAccount.checkInterest());
    }
}
