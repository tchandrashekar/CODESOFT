import java.util.*;

public class Atm_Project {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int accno=1234567890;
        int pin=1234;//default pin
        int balance=1000,withdraw,deposit;//minimum balance is 1000
        while(true)
        {
            System.out.println("***** Welcome to the Atm *****");
            System.out.println("Press 1 to pin generation");
            System.out.println("Press 2 to deposite");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to check balance");
            System.out.println("Press 5 to pin change");
            System.out.println("Press 6 to exit");
            System.out.println("Enter the option number to be performed:");

            int option=s.nextInt();
            int user_accno,user_pin;
            switch (option) {
                case 1:
                    System.out.println("...Pin gereration:...");
                    System.out.println("Enter the account no:");
                    user_accno=s.nextInt();//getting input from user
                    if(accno==user_accno)//checking user details and existing details of account
                    {
                        System.out.println("Enter the new pin:");
                        int newpin=s.nextInt();
                        pin=newpin;
                        System.out.println("*** Successfully new pin generated ***");
                    }
                    else
                    {
                        System.out.println("Wrong Input");
                    }
                    
                    break;

                case 2:
                    System.out.println("....Depoist:....");
                    System.out.println("Enter the account no");
                    user_accno=s.nextInt();
                    System.out.println("Enter the pin");
                    user_pin=s.nextInt();
                    if(user_accno==accno && pin==user_pin)
                    {
                        System.out.println("Enter the deposite amount ");
                        deposit=s.nextInt();
                        System.out.println("Credited amount:"+deposit);
                        balance=balance+deposit;
                        System.out.println("After deposit the balance is: "+balance);
                    }
                    else
                    {
                        System.out.println("Wrong Input");
                    }
                    break;

                case 3:
                    System.out.println("....Withdraw:....");
                    System.out.println("Enter the account no");
                    user_accno=s.nextInt();
                    System.out.println("Enter the pin");
                    user_pin=s.nextInt();
                    if(user_accno==accno && pin==user_pin)
                    {
                        System.out.println("Enter the withdraw amount ");
                        withdraw=s.nextInt();
                        if(balance-withdraw < 1000 && withdraw<balance)
                        {
                            System.out.println("Insufficent Balance ");
                        }
                        else 
                        {
                            System.out.println("Debiited Amount"+withdraw);
                            balance=balance-withdraw;
                            System.out.println("After withdraw the balance amount is: "+balance);
                         }
                    }
                    else{
                        System.out.println("Wrong Input");
                    }
                    
                    break;

                case 4:
                    System.out.println("....Balance Enquiery:....");
                    System.out.println("Enter the account no");
                    user_accno=s.nextInt();
                    System.out.println("Enter the pin");
                    user_pin=s.nextInt();
                    if(user_accno==accno && pin==user_pin)
                    {
                        System.out.println("The Balance is:"+balance);
                    }
                    else
                    {
                        System.out.println("Wrong Input");
                    }
                    break;

                case 5:
                    System.out.println(".....Pin Change.....");
                    System.out.println("Enter the account no:");
                    user_accno=s.nextInt();
                    System.out.println("Enter the old pin:");
                    user_pin=s.nextInt();
                    if(user_accno==accno && user_pin==pin)
                    {
                        System.out.println("Enter the updation pin");
                        int newpin=s.nextInt();
                        pin=newpin;
                    }
                    System.out.println("Successfully updated pin :");
                    break;

                default:
                    System.out.println("*** Thank you and vist again ***");
                    System.exit(0);
                    break;
            }
        }
    }
}