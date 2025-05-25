public class LocVacant {
    private String function;
    private String nameSubdiviziune;
    private String country;

    public LocVacant(String function, String nameSubdiviziune, String country) {
        this.function = function;
        this.nameSubdiviziune = nameSubdiviziune;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
