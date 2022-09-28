class TestCalculator {
  public static void main(String[] args) {
	  /*
	   * Uncomment the code below once Calculator has been created!
	   */
      Calculator calc = new Calculator();
      System.out.println("1 + 2 = " + calc.add(1, 2) + " -> Num op: " + calc.nOpDone + ", Last res: " + calc.lastRes);
      System.out.println("-1 - 2 = " + calc.sub(-1, 2) + " -> Num op: " + calc.nOpDone + ", Last res: " + calc.lastRes);
      System.out.println("6 * 3 = " + calc.mul(6, 3) + " -> Num op: " + calc.nOpDone + ", Last res: " + calc.lastRes);
      System.out.println("8 / 4 = " + calc.div(8, 4) + " -> Num op: " + calc.nOpDone + ", Last res: " + calc.lastRes);

  }
}
