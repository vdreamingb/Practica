//nume, adresă, telefon, țară
public class Filiala {
    private String name;
    private String address;
    private String phoneNumber;
    private String country;

    public Filiala(String name, String address, String phoneNumber, String country){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}