package StatePattern;

public class NewState implements State {

    private ChangeRequestSystem changeRequestSystem;

    NewState(ChangeRequestSystem changeRequestSystem){
        this.changeRequestSystem = changeRequestSystem;
    }

    @Override
    public void assignToDev() {
        this.changeRequestSystem.setCurrentState(changeRequestSystem.getDevState());
        System.out.println("assign to dev");
    }

    @Override
    public void assignToTester() {
        System.out.println("Can't be assigned to tester");

    }

    @Override
    public void closed() {
        System.out.println("cannot be marked as tested when it is newly created");
    }
}
