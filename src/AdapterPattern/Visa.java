package AdapterPattern;

public interface Visa {

    void setCreditCardNumber(String creditCardNumber);
    void setCardHolderName(String cardHolderName);
    void setExpiryMonth(String expiryMonth);
    void setExpiryYear(String expiryYear);
    void setCVV(String cVV);
    void setAmount(String amount);

    String getCreditCardNumber();
    String getCardHolderName();
    String getExpiryMonth();
    String getExpiryYear();
    String getCVV();
    String getAmount();

}
