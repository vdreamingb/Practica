import java.util.HashMap;

public class Candidat extends Persoana {
    private boolean programatLaInterviu;

    public Candidat(String name, String surname, int[] IDNP, String phoneNumber, boolean programatLaInterviu){
        super(name,surname, phoneNumber, IDNP);
        this.programatLaInterviu = programatLaInterviu;
    }

    public boolean isProgramatLaInterviu() {
        return programatLaInterviu;
    }

    public void setProgramatLaInterviu(boolean programatLaInterviu) {
        this.programatLaInterviu = programatLaInterviu;
    }

    @Override
    public void getPersonalInfo(){
        personalInfo.put("name", getName());
        personalInfo.put("surname", getSurname());
        personalInfo.put("phoneNumber", getPhoneNumber());
        personalInfo.put("programatLaInterviu", String.valueOf(isProgramatLaInterviu()));
        personalInfo.put("IDNP", getIDNPString());

    }
}
