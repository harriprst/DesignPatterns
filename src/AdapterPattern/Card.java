package AdapterPattern;

public interface Card {

    void setCardNo(String cardNo);
    void setCardHolderName(String cardHolderName);
    void setExpiryDetails(String expiryDetails);
    void setCVV(String cVV);
    void setTotalAmount(String totalAmount);

    String getCardNo();
    String getCardHolderName();
    String getExpiryDetails();
    String getCVV();
    String getTotalAmount();

}
