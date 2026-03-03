public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private Integer dateAllowance;
    private boolean unliCallText;

    // Constructor
    public Telco(Integer dateAllowance, Double promoPrice, String telcoName, boolean unliCallText) {
        this.dateAllowance = dateAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    // Getters and Setters
    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public Integer getDateAllowance() {
        return dateAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    // Accepting Visitor Methods
    @Override
    public String accept(UsagePromo promo, double price) {
     return promo.showAllowance(telcoName, price);
    }
    @Override
    public String accept(UnliCallOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

}