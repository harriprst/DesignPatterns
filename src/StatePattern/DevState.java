package StatePattern;

public class DevState implements State {

    ChangeRequestSystem changeRequestSystem;

    public DevState(ChangeRequestSystem changeRequestSystem) {
        this.changeRequestSystem = changeRequestSystem;
    }

    @Override
    public void assignToDev() {
        System.out.println("assign to dev");
    }

    @Override
    public void assignToTester() {
        System.out.println("assign to tester");
        this.changeRequestSystem.setCurrentState(changeRequestSystem.getTestingState());
    }

    @Override
    public void closed() {
        System.out.println("cannot be marked as tested when it is with Dev");
    }
}
