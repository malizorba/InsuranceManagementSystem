import java.util.Objects;

public class BusinessAdress implements Adress {
    private String Workadress;
    private  int id;
    private static int totalid=1;

    public BusinessAdress(String workadress) {
        Workadress = workadress;
        this.id=totalid++;
    }

    public String getWorkadress() {
        return Workadress;
    }

    public void setWorkadress(String workadress) {
        Workadress = workadress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotalid() {
        return totalid;
    }

    public static void setTotalid(int totalid) {
        BusinessAdress.totalid = totalid;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.getClass().getName().equals("HomeAddress")) {
            BusinessAdress HomeAdress = (BusinessAdress) obj;
            return (HomeAdress.getId() != this.getId());
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public void printAdress() {

    }
}
