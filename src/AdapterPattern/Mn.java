package AdapterPattern;

public class Mn {
    public static void main(String[] args) {

        Visa v = new VisaImplementation();
        v.setCreditCardNumber("123456789");
        v.setCardHolderName("Harri");
        v.setExpiryMonth("06");
        v.setCVV("1234");
        v.setExpiryYear("1991");
        v.setAmount("180000");

        VisaToCardAdapter visaToCardAdapter = new VisaToCardAdapter(v);
        System.out.println(visaToCardAdapter.toString());
    }
}
