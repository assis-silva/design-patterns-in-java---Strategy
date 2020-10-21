class ConcreteStrategyPowerof implements Strategy{

  public int execute(int a, int b){
    return (int) Math.pow(a, b);
  }
}