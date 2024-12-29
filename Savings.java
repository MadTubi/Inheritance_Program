public class Savings extends Checkings{
    
    //private variables
    private double savings;

    //constructor
    public Savings(String accNumber, double checkings, double savings){
        super(accNumber ,checkings);
        this.savings = savings;
    }

    //Override methods from superclass to deposit
    //and withdraw from savings account. Also to
    //add information to the getInfo() method as well
    @Override
    public void deposit(double amount){
        savings += amount;
        System.out.println(" --$"+amount + " has been deposited into your account-- ");
    }


    @Override
    public void withdraw(double amount){
        if(amount > savings){
            System.out.println("Insufficient Funds - cannot withdarw requested amount");
        }else{
            savings -= amount;
            System.out.println(" --$"+amount + " has been withdrawn into your account-- ");
        }
    }

    @Override
    public String getInfo(){

        String message;

        message = super.getInfo() +
        "\nSavings: $" + savings;

        

        return message;
    }


}

