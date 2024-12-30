package StatePattern;

public class ClosedState implements State {

    private ChangeRequestSystem changeRequestSystem;

    public ClosedState(ChangeRequestSystem changeRequestSystem) {
        this.changeRequestSystem = changeRequestSystem;
    }

    @Override
    public void assignToDev() {
        System.out.println("assign to dev");
    }

    @Override
    public void assignToTester() {
        System.out.println("assign to tester");
    }

    @Override
    public void closed() {
        System.out.println("assign to closed");
        this.changeRequestSystem.setCurrentState(changeRequestSystem.getClosedState());
    }
}
