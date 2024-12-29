public class Bank {

    public static void main(String[] args) {
        
        //Checkings object (superclass)
        Checkings chk = new Checkings("B4235", 234.09);
        chk.deposit(1456.55);
        chk.withdraw(555.25);
        System.out.println(chk.getInfo());

        System.out.println("\n");

        //Savings object(subclass)
        Savings sav = new Savings("BS421", 234,0);
        sav.deposit(1020.50);
        sav.withdraw(1500.90);
        System.out.println(sav.getInfo());

    }
    
}
