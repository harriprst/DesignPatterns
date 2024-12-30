package StatePattern;

public class Mn {
    public static void main(String[] args) {
        ChangeRequestSystem changeRequestSystem = new ChangeRequestSystem();
        changeRequestSystem.assignToTester();
        changeRequestSystem.assignToDev();
        changeRequestSystem.assignToTester();
        changeRequestSystem.closed();
    }
}
