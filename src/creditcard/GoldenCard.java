package creditcard;

import offer.OfferVistor;

public class GoldenCard implements  CreditCard{
    @Override
    public void accept(OfferVistor vistor) {
        vistor.calculateDiscountForGoldenCard(this);
    }
}
