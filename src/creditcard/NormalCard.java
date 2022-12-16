package creditcard;

import offer.OfferVistor;

public class NormalCard implements CreditCard {
    @Override
    public void accept(OfferVistor vistor) {
        vistor.calculateDiscountForNormalCard(this);
    }
}
