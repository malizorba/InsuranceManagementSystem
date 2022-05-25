import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account {
    public enum Authenticationstatus{
        SUCCES,
        FAIL
    }
    Scanner input=new Scanner(System.in);
    private User user;
    Authenticationstatus authStatus;
    private ArrayList<Insurance> insuranceList=new ArrayList<>();

    public Account(User user){
        this.user=user;
    }

    public void accountMenu(){
        System.out.println();
        System.out.println("Accountant"+this.getUser().getLastname());
        System.out.println("===========================================");
        System.out.println(" 1 - Show Account Info");
        System.out.println(" 2 - Add adress");
        System.out.println(" 3 - Show adress");
        System.out.println(" 4 - Make a insurance deal");
        System.out.println(" 5 - Show insurance information");
        System.out.println(" 6 - Calcute insurance price");
        System.out.println(" 0 - Exit");

        System.out.println("Please select operation that you want to do");

        int selection= input.nextInt();
        switch (selection){
            case 1 : this.showUserInfo();
            break;

            case 2 :this.addAdress();
            break;

            case 3 :this.showAdress();
            break;

            case 4:this.addInsurance();
            break;

            case 5:this.showInsuranceList();
            break;

            case 6:this.calculateInsurance();
            break;

            case 0:System.out.println("You are leaving");
            break;

            default: System.out.println("Your selection is not valid");
            accountMenu();
        }

    }
    public final void showUserInfo(){
        System.out.println("First Name"+user.getFirstname()+" "+"Last Name"+user.getLastname());
        System.out.println("Job"+user.getJob());
        System.out.println("E-mail"+user.getEmail());
        System.out.println("Age"+user.getAge());
        System.out.println("Last Seen :"+user.getLastseen());
    }
    public void addAdress(){
        System.out.println("1-Home Adress");
        System.out.println("2-Work adress");
        System.out.println("0-Back to Menu");
        System.out.println("Please select that you want to operation");
        int select=input.nextInt();
        System.out.println("Please enter your adress");
        String adress=input.nextLine();
        switch (select){
            case 1:HomeAdress HomeAdress=new HomeAdress(adress);
            AddressManager.addHomeAdress(new HomeAdress(adress));
            break;

            case 2:BusinessAdress BusinessAdress=new BusinessAdress(adress);
            AddressManager.addBusinessAdress(new BusinessAdress(adress));
            break;

            case 0: System.out.println("You are going menu");
            addAdress();
        }
    }
    public void showAdress(){
        System.out.println();
        System.out.println("1 - Show home adress");
        System.out.println("2 - Show business adress");
        System.out.println("0 - Exit");
        System.out.println("Please enter your choice");
        int choice=input.nextInt();

        switch (choice){
            case 1 : System.out.println("Home adress:"+AddressManager.getListHomeAdress());
            break;

            case 2 : System.out.println("Business Adress"+AddressManager.getListBusinessAdress());
            break;

            case 0 : System.out.println("You left menu");
            break;

            default: System.out.println("Your choice is not valid");
            showAdress();
            break;
        }
    }
    public void logIn(String email,String password) throws InvalidAuthenticationException{
        if (email.equals(this.getUser().getEmail())&&password.equals(this.getUser().getPassword())){
            authStatus=Authenticationstatus.SUCCES;

        }
        else {
            authStatus=Authenticationstatus.FAIL;
        }
        switch (authStatus){
            case SUCCES:
                System.out.println("You are looged in");
                this.accountMenu();
                break;
            case FAIL:
                throw new  InvalidAuthenticationException("Invalid Authentication");
        }
    }

    public void signUp(){

    }
    public double calculateInsurance(){
        return 0;
    }

    public void addInsurance() {
        System.out.println();
        System.out.println("Insuraces");
        System.out.println("1-Health Insurance");
        System.out.println("2-Car Insurance");
        System.out.println("3-Travel Insurance");
        System.out.println("4-Residance Insurance");
        System.out.println("0-Back to Main menu");
        int selectionInsurance = input.nextInt();
        switch (selectionInsurance) {
            case 1:
                insuranceList.add(new HealthInsurance());
                break;
            case 2:
                insuranceList.add(new CarInsurance());
                break;
            case 3:
                insuranceList.add(new TravelInsurance());
                break;
            case 4:
                insuranceList.add(new ResidenceInsurance());
                break;
            case 0:
                System.out.println("You are goin to main menu");
                accountMenu();
                break;
            default:
                System.out.println("Your selection is not valid");
                addInsurance();

        }
    }
        public void showInsuranceList(){
            System.out.println();
            int count=1;
            for (Insurance insurance:insuranceList) {
                System.out.println(count++ +"--"+insurance.getClass().getName());
                
            }
        }
        public User getUser(){
            return user;
        }
        public void setUser(User user){
            this.user=user;
        }

    }


