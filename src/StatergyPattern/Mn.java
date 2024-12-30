package StatergyPattern;

public class Mn {
    public static void main(String[] args) {

        ValidationStratergy validationStratergy = new ValidationStratergy();

        Validation onlineValidation = new OnlineValidation();
        Validation instantValidation = new InstantValidation();

        validationStratergy.setState(onlineValidation);
        validationStratergy.validate("12345");

        validationStratergy.setState(instantValidation);
        validationStratergy.validate("12345");

    }
}
