public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private Integer dataAllowance;
    private boolean unliCallText;

    // Constructor
    public Telco(Integer dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
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

    public Integer getDataAllowance() {
        return dataAllowance;
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