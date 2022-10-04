package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder a1 = new AccountHolder("Andrea", "Rossi", 1);

        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder a2 = new AccountHolder("Alex", "Bianchi", 2);

        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount s1 = new SimpleBankAccount(a1.getUserID(), 500);
        SimpleBankAccount s2 = new SimpleBankAccount(a2.getUserID(), 40);
        // 4) Effettuare una serie di depositi e prelievi
        s1.depositFromATM(a1.getUserID(), 30);
        s1.withdrawFromATM(a1.getUserID(), 60);
        s2.depositFromATM(a2.getUserID(), 100);
        s2.withdrawFromATM(a2.getUserID(), 21);

        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */

        System.out.println(s1.getBalance());
        System.out.println(s2.getBalance());
        

        // 6) Provare a prelevare fornendo un id utente sbagliato
        s1.withdraw(a2.getUserID(), 30);

        // 7) Controllare nuovamente l'ammontare
        System.out.println(s1.getBalance());
        System.out.println(s2.getBalance());
    }
}
