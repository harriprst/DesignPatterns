package StatergyPattern;

public class InstantValidation implements Validation {
    @Override
    public void validation(String ticketSerialNumber) {
        System.out.println("Perform Instant Validation for Ticket serial number " + ticketSerialNumber);
    }
}
