import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Individual> accountsIndividual=new TreeSet<>(new AccountComparator());
    private static TreeSet<Enterprise> accountsEnterprise=new TreeSet<>(new AccountComparator());

    public static void logIn(String email,String password,int choice){
        if (choice==1){
            for (Individual account:accountsIndividual) {
                try {
                    account.logIn(email, password);
                }catch (InvalidAuthenticationException e){
                    if (email.equals(account.getUser().getEmail()) && !password.equals(account.getUser().getPassword())) {
                        System.out.println("email is correct but password is wrong please check and try again!");
                }else {
                        System.out.println();
                        System.out.println("There have not been signed up yet");
                    }
                
            }
        }
    }
       else if (choice==2){
            for (Enterprise account:accountsEnterprise) {
                try {
                    account.logIn(email, password);
                }catch (InvalidAuthenticationException e){
                    if (email.equals(account.getUser().getEmail())&&!password.equals(account.getUser().getPassword())){
                        System.out.println("Password is wrong please try again!");


                    }else{
                        System.out.println();
                        System.out.println("You do not have an account . Please sign up");
                    }

                }
                
            }
            if (accountsIndividual.isEmpty()&&accountsEnterprise.isEmpty()){
                System.out.println("You do not have an account . Please sign up");
            }
        }

        }
    public static TreeSet<Individual> getAccountsIndividual() {
        return accountsIndividual;
    }

    public static void addAccountsIndividual(Individual account) {
        accountsIndividual.add(account);
    }

    public static TreeSet<Enterprise> getAccountsEnterprise() {
        return accountsEnterprise;
    }

    public static void addAccountsEnterprise(Enterprise account) {
        accountsEnterprise.add(account);
    }
}
