package StatergyPattern;

public class OnlineValidation implements Validation {
    @Override
    public void validation(String ticketSerialNumber) {
        System.out.println("Perform online validation for ticket serial number " + ticketSerialNumber);
    }
}
