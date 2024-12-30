package Observer;

public class OfflineAccount implements Account {
    @Override
    public void mointorAccountNumberChange() {
        System.out.println("Offline Account Number Changed !");
    }
}
