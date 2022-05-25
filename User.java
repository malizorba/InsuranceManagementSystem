import java.util.ArrayList;

public class User {
    private String firstname;
    private String lastname;
    private String Age;
    private String Job;
    private String email;
    private String Lastseen;
    private String password;
    private ArrayList<Adress> listHomeAdress;
    private ArrayList<Adress> listBusinessAdress;

    public String getLastseen() {
        return Lastseen;
    }

    public void setLastseen(String lastseen) {
        Lastseen = lastseen;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Adress> getListHomeAdress() {
        return listHomeAdress;
    }

    public void setListHomeAdress(ArrayList<Adress> listHomeAdress) {
        this.listHomeAdress = listHomeAdress;
    }

    public ArrayList<Adress> getListBusinessAdress() {
        return listBusinessAdress;
    }

    public void setListBusinessAdress(ArrayList<Adress> listBusinessAdress) {
        this.listBusinessAdress = listBusinessAdress;
    }




}
