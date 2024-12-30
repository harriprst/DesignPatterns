package AdapterPattern;

public class VisaImplementation implements Visa {


    String creditCardNumber;
    String cardHolderName;
    String expiryMonth;
    String expiryYear;
    String cVV;
    String amount;


    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    @Override
    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    @Override
    public void setCVV(String cVV) {
        this.cVV = cVV;
    }

    @Override
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public String getExpiryMonth() {
        return expiryMonth;
    }

    @Override
    public String getExpiryYear() {
        return expiryYear;
    }

    @Override
    public String getCVV() {
        return cVV;
    }

    @Override
    public String getAmount() {
        return amount;
    }
}
