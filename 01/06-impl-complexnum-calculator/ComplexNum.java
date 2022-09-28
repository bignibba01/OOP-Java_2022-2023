class ComplexNum {
    /*
     * Inserire qui la dichiarazione dei campi della classe
     */

    double re;
    double im;

    void build(double re, double im) {
         this.re = re;
         this.im = im;
    }

    void add(ComplexNum num) {
        this.re += num.re;
        this.im += num.im;
    }

    void sub(ComplexNum num) {
        this.re -= num.re;
        this.im -= num.im;
    }

    void mul(ComplexNum num) {
        ComplexNum tmp = new ComplexNum();
        tmp.build(this.re, this.im);

        this.re = tmp.re * num.re - tmp.im * num.im;
        this.im = (tmp.im * num.re) + (tmp.re * num.im);
    }

    void div(ComplexNum num) {
        ComplexNum tmp = new ComplexNum();
        tmp.build(this.re, this.im);

        this.re = (tmp.re * num.re + tmp.im * num.im) / (num.re * num.re + num.im * num.im);
        this.im = (tmp.im * num.re - tmp.re * num.im) / (num.re * num.re + num.im * num.im);
    }

    String toStringRep() {
        /*
         * Implementare il metodo in modo che restituisca una rappresentazione
         * testuale del numero complesso
         */
        return this.re + (this.im >= 0 ? "+" : "") + this.im + "i\"";
            
    }
}