import java.util.HashSet;

public class AddressManager {
    static HashSet<HomeAdress> listHomeAdress=new HashSet<>();
    static HashSet<BusinessAdress>listBusinessAdress=new HashSet<>();

    public static HashSet<HomeAdress> getListHomeAdress() {
        return listHomeAdress;
    }

    public static void setListHomeAdress(HashSet<HomeAdress> listHomeAdress) {
        AddressManager.listHomeAdress = listHomeAdress;
    }

    public static HashSet<BusinessAdress> getListBusinessAdress() {
        return listBusinessAdress;
    }

    public static void setListBusinessAdress(HashSet<BusinessAdress> listBusinessAdress) {
        AddressManager.listBusinessAdress = listBusinessAdress;
    }
    public static void addBusinessAdress(BusinessAdress BusinessAdress){
        listBusinessAdress.add(BusinessAdress);
    }
    public static void addHomeAdress(HomeAdress HomeAdress){
        listHomeAdress.add(HomeAdress);
    }
}
