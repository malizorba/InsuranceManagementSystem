public  class HomeAdress implements Adress{
    private String houseAdress;
    private static int totalid=1;
    private int id;

    public HomeAdress(String houseAdress) {
        this.houseAdress = houseAdress;
        this.id=totalid;
    }

    public String getHouseAdress() {
        return houseAdress;
    }

    public void setHouseAdress(String houseAdress) {
        this.houseAdress = houseAdress;
    }

    public static int getTotalid() {
        return totalid;
    }

    public static void setTotalid(int totalid) {
        HomeAdress.totalid = totalid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.getClass().getName().equals("HomeAddress")) {
            HomeAdress homeAddress = (HomeAdress) obj;
            return (homeAddress.getId() != this.getId());
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }

    @Override
    public void printAdress() {

    }
}
