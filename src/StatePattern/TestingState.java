package StatePattern;

public class TestingState implements State {

    private ChangeRequestSystem changeRequestSystem;

    public TestingState(ChangeRequestSystem changeRequestSystem) {
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
    }
}
