package Observer;

public class OnlineAccount implements Account{
    @Override
    public void mointorAccountNumberChange() {
        System.out.println("Online Account Number Change ");
    }
}
