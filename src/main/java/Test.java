public class Test {
    public static void main(String[] args) {
        Context context=new Context();
        context.applyStrategy();
        context.setStrategy(new StrategyImpl1());
        context.applyStrategy();
        context.setStrategy(new StrategyImpl2());
        context.applyStrategy();
    }
}
