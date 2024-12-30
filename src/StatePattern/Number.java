package StatePattern;

public class Number implements GameType {
    @Override
    public void enterWinningNumber() {
        System.out.println("Number enter rpc will be called");
    }

    @Override
    public void verifyWinningNumber() {
        System.out.println("Number verify will be called");
    }
}
