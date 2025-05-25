public class Formare {
    private Angajat angajat;
    private String courseType;
    private boolean passed;

    public Formare(Angajat angajat, String courseType, boolean passed) {
        this.angajat = angajat;
        this.courseType = courseType;
        this.passed = passed;
    }

    public Angajat getAngajat() {
        return angajat;
    }

    public void setAngajat(Angajat angajat) {
        this.angajat = angajat;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
