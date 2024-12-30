package StatePattern;

public class ChangeRequestSystem implements State{

    State newState;
    State devState;
    State testingState;
    State closedState;
    State currentState = new NewState(this);

    ChangeRequestSystem(){
        this.newState = new NewState(this);
        this.devState = new DevState(this);
        this.testingState = new TestingState(this);
        this.closedState = new ClosedState(this);
    }

    @Override
    public void assignToDev() {
        currentState.assignToDev();
    }

    @Override
    public void assignToTester() {
        currentState.assignToTester();
    }

    @Override
    public void closed() {
        currentState.closed();
    }

    public State getNewState() {
        return newState;
    }

    public void setNewState(State newState) {
        this.newState = newState;
    }

    public State getDevState() {
        return devState;
    }

    public void setDevState(State devState) {
        this.devState = devState;
    }

    public State getTestingState() {
        return testingState;
    }

    public void setTestingState(State testingState) {
        this.testingState = testingState;
    }

    public State getClosedState() {
        return closedState;
    }

    public void setClosedState(State closedState) {
        this.closedState = closedState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
