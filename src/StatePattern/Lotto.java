package StatePattern;

public class Lotto implements GameType {
    @Override
    public void enterWinningNumber() {
        System.out.println("Lotto enter rpc will be called");
    }

    @Override
    public void verifyWinningNumber() {
        System.out.println("Lotto verify rpc will be called");
    }
}
