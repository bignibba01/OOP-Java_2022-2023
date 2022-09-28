class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Nome: " + this.name + ", Cognome: " + this.surname + ", Id: " + this.id + ", Anno Immatricolazione: " + matriculationYear);
    }
}
