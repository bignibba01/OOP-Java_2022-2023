package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student s1 = new Student(1, "Mario", "Rossi", "ciao", 2012);
        Student s2 = new Student(2, "Luigi", "Bianchi", "12ra", 2013);
        Student s3 = new Student(3, "Gianni", "Verdi", "zio31", 2014);

        // 2)Creare 2 docenti a piacere
        Professor p1 = new Professor(1, "Alfredo", "Argentato", "pass", new String[] {"OOP", "Sistemi Operativi"});
        Professor p2 = new Professor(1, "Luca", "Bennato", "1265", new String[] {"Analisi", "MDP"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom r1 = new ExamRoom(100, "no description", true, true);
        ExamRoom r2 = new ExamRoom(80, "funny", true, false);
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam e1 = new Exam(1, 10, "OOP", p1, r1);
        Exam e2 = new Exam(2, 2, "MDP", p2, r2);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        e1.registerStudents(s1);
        e1.registerStudents(s2);    
        e1.registerStudents(s3);
        e2.registerStudents(s1);
        e2.registerStudents(s2);
        e2.registerStudents(s3);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }   
}
