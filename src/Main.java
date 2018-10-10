public class Main {

    public static void main(String[] args) {

	Student studentJonas = new Student();
    studentJonas.setId("39109309808");
    studentJonas.setVardas("Jonas");
    studentJonas.setPavarde("Jonaitis");
    studentJonas.setGrupe("FMF 0/1");

    Student studentPetras = new Student("Petras","Petraitis","39008078967","FMF 0/2");
    studentPetras.setGrupe("????");

    System.out.println("Vardas Pavarde Id Grupe");
    studentPetras.spaudintiStudentoObjekta();
    studentJonas.spaudintiStudentoObjekta();
    System.out.println(studentJonas);

    System.out.println();
    }
}
