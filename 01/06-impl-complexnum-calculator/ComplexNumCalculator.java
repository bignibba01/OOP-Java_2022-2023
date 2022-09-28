class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes = new ComplexNum();

    void build() {
        this.nOpDone = nOpDone;
    }

    ComplexNum add(ComplexNum x, ComplexNum y) {
        this.nOpDone++;
        x.add(y);
        this.lastRes.build(x.re, x.im);
        return x;
    }

    ComplexNum sub(ComplexNum x, ComplexNum y) {
        this.nOpDone++;
        x.sub(y);
        this.lastRes.build(x.re, x.im);
        return x;
    }

    ComplexNum mul(ComplexNum x, ComplexNum y) {
        this.nOpDone++;
        x.mul(y);
        this.lastRes.build(x.re, x.im);
        return x;
    }

    ComplexNum div(ComplexNum x, ComplexNum y) {
        this.nOpDone++;
        x.div(y);
        this.lastRes.build(x.re, x.im);
        return x;
    }

}