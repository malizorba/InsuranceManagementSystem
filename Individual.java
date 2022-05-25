public class Individual extends Account{
    private User user;

    public Individual(User user){
        super(user);
    }

    @Override
    public void signUp() {
        System.out.println("CREATE NEW ACCOUNT");
        System.out.println("===============================");
        System.out.println("First Name");
        this.getUser().setFirstname(input.next());
        System.out.println("Last Name");
        this.getUser().setLastname(input.next());
        System.out.println("Email :");
        String email=input.next();
        this.getUser().setEmail(email);
        System.out.println("Password");
        String password=input.next();
        this.getUser().setPassword(password);
        System.out.println("Job :");
        String job=input.next();
        this.getUser().setJob(job);
        System.out.println("Age");
        String age=input.next();
        this.getUser().setAge(age);

        for (Account account:AccountManager.getAccountsIndividual()) {
            if (email.equals(account.getUser().getEmail())){
                System.out.println("Account has been created with this email");
                return;
            }

        }
        AccountManager.addAccountsIndividual(this);
        System.out.println();
        System.out.println("Account has been created");

    }
    public double calculate(){
        return 0;
    }
}
