import java.util.HashMap;

public class Angajat extends Persoana{
    private String address;
    private String function;
    private String nameSubdiviziune;
    private String company;


    public Angajat(String name, String surname, int[] IDNP, String address, String phoneNumber, String function, String nameSubdiviziune, String company){
        super(name, surname, phoneNumber, IDNP);
        this.address = address;
        this.function = function;
        this.nameSubdiviziune = nameSubdiviziune;
        this.company = company;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getNameSubdiviziune() {
        return nameSubdiviziune;
    }

    public void setNameSubdiviziune(String nameSubdiviziune) {
        this.nameSubdiviziune = nameSubdiviziune;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public void getPersonalInfo(){
        personalInfo.put("name", getName());
        personalInfo.put("surname", getSurname());
        personalInfo.put("phoneNumber", getPhoneNumber());
        personalInfo.put("address", getAddress());
        personalInfo.put("IDNP", getIDNPString());
        personalInfo.put("function", getFunction());
        personalInfo.put("company",getCompany());
        personalInfo.put("nameSubdiviziune", getNameSubdiviziune());
    }


}
