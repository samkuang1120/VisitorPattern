package offer;

import creditcard.CreditCard;

public class TrafficOffer implements OfferVistor{
    @Override
    public void calculateDiscountForGoldenCard(CreditCard creditCard) {
        System.out.println("Traffic discount for golden card is 2.5%" );
    }

    @Override
    public void calculateDiscountForSilverCard(CreditCard creditCard) {
        System.out.println("Traffic discount for golden card is 1.5%" );
    }

    @Override
    public void calculateDiscountForNormalCard(CreditCard creditCard) {
        System.out.println("Traffic discount for golden card is 0.8%" );
    }
}
