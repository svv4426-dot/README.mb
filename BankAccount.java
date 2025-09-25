public class BankAccount{ 
    private String name;
    private long acno;
    private double bal;
    private int pin;

    BankAccount(String name,long acno,double bal,int pin){
        this.name=name;
        this.acno=acno;
        this.bal=bal;
        this.pin=pin;
    }

  public void deposit(int enterpin, int amt){
    if(enterpin==pin){
        if(amt>0){
            bal+=amt;
            System.out.println("Your amount deposited ₹"+amt);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    else{
        System.out.println("Invalid amount");
    }
  }
  public void withdraw(int enterpin, int amt){
    if(enterpin==pin){
        if(amt>0 && bal-amt>=500){
            bal-=amt;
            System.out.println("Amount Withdrwn ₹"+amt);
        }
        else{
            System.out.println("Invalid AmountS");
        }
    }
    else{
        System.out.println("Invalid Pin");
    }
  }

  public void printbalance(int enterpin){
    if(enterpin==pin){
        System.out.println("Mr. " + name + ", of account number " + acno + ", your account balance is ₹" + bal);
    }
    else{
        System.out.println("Invalid Pin");
    }

  }
}