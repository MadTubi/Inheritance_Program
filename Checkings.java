public class Checkings{

    //private variables
    private String accNumber;
    private double checkings;

    public Checkings(String accNumber, double checkings){
        this.accNumber = accNumber;

        this.checkings = checkings;
    }


    public double getCheckings(){
        return checkings;
    }

    public void deposit(double amount){
        checkings += amount;
        System.out.println(" --$"+amount + " has been deposited into your account-- ");
    }

    public void withdraw(double amount){
        if(amount > checkings){
            System.out.println("Insufficient Funds - cannot withdraw requested amount");
        }else{
            checkings -= amount;
            System.out.println(" --$"+amount + " has been withdrawn into your account-- ");

        }
    }

    public String getInfo(){

        String message;

        message = "Account Number: " + accNumber +
        "\nCheckings: $"+ checkings;

        return message;
    }

}