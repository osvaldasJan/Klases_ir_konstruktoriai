public class Student {

    private String vardas;
    private String pavarde;
    private String id;
    private String grupe;
    public String idd;

    public Student() {
    }

    public Student(String vardas, String pavarde, String id, String grupe) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.id = id;
        this.grupe = grupe;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getGrupe() {
        return grupe;
    }

    public void setGrupe(String grupe) {
        this.grupe = grupe;
    }

    public void spaudintiStudentoObjekta() {
        System.out.println(vardas+" "+pavarde+" "+id+" "+grupe);
    }
}
