import java.util.Scanner;

public class LoginPage {
    Scanner input=new Scanner(System.in);
    public void run(){

        while (true){
            System.out.println();
            System.out.println("Insurance Management System");
            System.out.println("1-Login");
            System.out.println("2-Sıgnup");
            System.out.println("0-Exit");
            System.out.println("Please Enter Your selection");
            int selection=input.nextInt();
            int selectionAccount;
            String email;
            String password;
            boolean isExit=false;

            switch (selection){
                case 1 :
                    System.out.println();
                    System.out.println("Login your account");
                    System.out.println("===============================");
                    System.out.println("1-Individual Account");
                    System.out.println("2-Enterprise Account");
                    System.out.println("3- Go to Back menu");
                    System.out.println("Your selection");
                    selectionAccount=input.nextInt();
                    switch (selectionAccount){
                        case 1:
                            System.out.println();
                            System.out.println("Indıvıdual Account");
                            System.out.println("===================");
                            System.out.println("E mail :");
                            email=input.next();
                            System.out.println("Password");
                            password=input.next();
                            AccountManager.logIn(email,password,selectionAccount);
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Enterprise Account");
                            System.out.println("=====================");
                            System.out.println("Email");
                            email=input.next();
                            System.out.println("Password");
                            password=input.next();
                            AccountManager.logIn(email,password,selectionAccount);
                            break;

                        case 0:
                        System.out.println("Leaving Menu");
                        break;

                    }
                case 2:
                    System.out.println();
                    System.out.println("Create  account");
                    System.out.println("1 - Individual Account");
                    System.out.println("2 - Enterprise Account");
                    System.out.println("0 - Go Back To Main Menu");
                    System.out.print("Your choice: ");
                    selectionAccount = input.nextInt();

                    switch (selectionAccount){
                        case 1:
                            System.out.println();
                            System.out.println("Indıvıdual Account");
                            Individual accountIndividual=new Individual(new User());
                            accountIndividual.signUp();
                            break;

                        case 2:
                            System.out.println();
                            System.out.println("Enterprise Account");
                            Enterprise accountEnterprise=new Enterprise(new User());
                            accountEnterprise.signUp();
                            break;

                    }
                    break;
                case 0:
                    isExit=true;
                    break;

                default:
                    System.out.println("Invalid Selection");

            }
            if (isExit){
                System.out.println("You are leaving");
                break;
            }
        }
    }
}
