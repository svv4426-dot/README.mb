public class TestAccount{
    public static void main(String []args){
        BankAccount a1=new BankAccount("Rahul",123456789,4500.00,1234);
        BankAccount a2=new BankAccount("Ramu",987654321,6500.00,9876);
        a1.deposit(1234,500);
        a1.printbalance(1234);
        a1.withdraw(1234,300);
        a1.printbalance(1234);

        a2.deposit(9876,500);
        a2.printbalance(9876);
        a2.withdraw(9876,300);
        a2.printbalance(9876);
    }
}