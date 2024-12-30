package AdapterPattern;

public class VisaToCardAdapter implements Card {
    String cardNo;
    String cardHolderName;
    String expiryDetails;
    String cVV;
    String totalAmount;

    final Visa visa;


    public VisaToCardAdapter(Visa visa) {
        this.visa = visa;
        setProperty();
    }

    private void setProperty() {
        setCardNo(this.visa.getCreditCardNumber());
        setCardHolderName(this.visa.getCardHolderName());
        setExpiryDetails(this.visa.getExpiryMonth()+"/"+this.visa.getExpiryYear());
        setCVV(this.visa.getCVV());
        setTotalAmount(this.visa.getAmount());
    }

    @Override
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void setExpiryDetails(String expiryDetails) {
        this.expiryDetails = expiryDetails;
    }

    @Override
    public void setCVV(String cVV) {
        this.cVV = cVV;
    }

    @Override
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String getCardNo() {
        return cardNo;
    }

    @Override
    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public String getExpiryDetails() {
        return expiryDetails;
    }

    @Override
    public String getCVV() {
        return cVV;
    }

    @Override
    public String getTotalAmount() {
        return totalAmount;
    }


    @Override
    public String toString() {
        return "VisaToCardAdapter{" +
                "cardNo='" + cardNo + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", expiryDetails='" + expiryDetails + '\'' +
                ", cVV='" + cVV + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", visa=" + visa +
                '}';
    }
}
