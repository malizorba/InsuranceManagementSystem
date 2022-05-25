public class Enterprise extends Account{
    private User user;

    public Enterprise(User user){
        super(user);
    }

    @Override
    public void signUp() {
        System.out.println(" CREATE NEW ACCOUNT");
        System.out.println("==========================");
        System.out.println("First Name");
        this.user.setFirstname(input.next());
        System.out.println("Last Name");
        this.user.setLastname(input.next());
        System.out.println("Email");
        String email=input.next();
        this.user.setEmail(email);
        System.out.println("Age");
        this.user.setAge(input.next());
        System.out.println("Job");
        this.user.setJob(input.next());
        System.out.println("Password");
        String password=input.nextLine();
        this.user.setPassword(password);

        for (Account account:AccountManager.getAccountsEnterprise()) {
            if (email.equals(account.getUser().getEmail())){
                System.out.println("There is an account with this e-mail");
                return;
            }
            
        }
        AccountManager.addAccountsEnterprise(this);
        System.out.println("Account has been created");

    }
}
