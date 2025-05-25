import java.net.IDN;
import java.util.HashMap;

abstract public class Persoana {
    private String name;
    private String surname;
    private String phoneNumber;
    private int[] IDNP;
    public HashMap<String, String> personalInfo;


    public Persoana(){}

    public Persoana(String name, String surname, String phoneNumber, int[] IDNP){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.IDNP = IDNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    abstract public void getPersonalInfo();

    public int[] getIDNP() {
        return IDNP;
    }

    public void setIDNP(int[] IDNP) {
        this.IDNP = IDNP;
    }
    public String getIDNPString(){
        int[] a = getIDNP();
        StringBuilder IDNPString = new StringBuilder();
        for(int i = 0; i < a.length; i++){
            IDNPString.append(a[i]);
        }
        return IDNPString.toString();
    }
}
