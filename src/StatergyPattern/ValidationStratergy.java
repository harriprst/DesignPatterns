package StatergyPattern;

public class ValidationStratergy {

    public Validation validation;

    void setState(Validation validation) {
        this.validation = validation;
    }



    void validate(String ticketSerialNumber) {
        validation.validation(ticketSerialNumber);
    }

}
