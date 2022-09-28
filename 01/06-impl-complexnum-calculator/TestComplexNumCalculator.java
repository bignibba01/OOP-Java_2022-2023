class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */

      ComplexNumCalculator c = new ComplexNumCalculator();
      ComplexNum c1 = new ComplexNum();
      ComplexNum c2 = new ComplexNum();

      c1.build(1, 2);
      c2.build(2, 3);

      System.out.println("add(c1, c2) = " + c.add(c1, c2).toStringRep());
      c1.build(4, 5);
      c2.build(6, 7);
      System.out.println("sub(c1, c2) = " + c.sub(c1, c2).toStringRep());
      c1.build(8, 2);
      c2.build(3, -1);
      System.out.println("mul(c1, c2) = " + c.mul(c1, c2).toStringRep());
      System.out.println("div(c1, c2) = " + c.div(c1, c2).toStringRep());

  }
}
