class Main {
  public static void main(String[] args) {
    Context context;

    context = new Context(new ConcreteStrategyAdd());
    int resultA = context.executeStrategy(3,4);
    System.out.println(resultA);

    context = new Context(new ConcreteStrategyMultiply());
    int resultB = context.executeStrategy(3,4);
    System.out.println(resultB);

    context = new Context(new ConcreteStrategySubtract());
    int resultC = context.executeStrategy(3,4);
    System.out.println(resultC);

    context = new Context(new ConcreteStrategyPowerof());
    int resultD = context.executeStrategy(3,4);
    System.out.println(resultD);

    context = new Context(new ConcreteStrategyDevide());
    int resultE = context.executeStrategy(10,2);
    System.out.println(resultE);
  }
}