package creditcard;

import offer.OfferVistor;

public class SilverCard implements CreditCard{
    @Override
    public void accept(OfferVistor vistor) {
        vistor.calculateDiscountForSilverCard(this);
    }
}
