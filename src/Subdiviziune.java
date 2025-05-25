public class Subdiviziune {
    private String name;
    private int code;
    private String nameFilial;

    public Subdiviziune(String name, int code, String nameFilial){
        this.name = name;
        this.code = code;
        this.name = nameFilial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameFilial() {
        return nameFilial;
    }

    public void setNameFilial(String nameFilial) {
        this.nameFilial = nameFilial;
    }
}
