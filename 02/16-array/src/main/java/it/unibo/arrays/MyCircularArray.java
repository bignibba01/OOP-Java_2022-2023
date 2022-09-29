package it.unibo.arrays;

class MyCircularArray {

    int[] array;
    private int index = 0;

    MyCircularArray() {
        this.array = new int[10];
    }

    MyCircularArray(int size) {
        this.array = new int[size];
    }

    int getIndex(int i) {
        return (i < 10 ? i : i % array.length);
    }

    void add(final int elem) {
        array[getIndex(index)] = elem;
        index++;
    }

    void reset() {
        for (int x: array) {
            add(0);
        }
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi
        MyCircularArray a1 = new MyCircularArray();

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        for (int i = 0; i <= 10; i++) {
            a1.add(i);
        }

        for (int x: a1.array) {
            System.out.print(x + "\t");
        }
        System.out.println("");
        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++) {
            a1.add(i);
        }
        for (int x: a1.array) {
            System.out.print(x + "\t");
        }
        System.out.println("");
        // 4) Invocare il metodo reset
        a1.reset();
        // 5) Stampare il contenuto dell'array circolare
        for (int x: a1.array) {
            System.out.print(x + "\t");
        }
        System.out.println("");
        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
    }
}
