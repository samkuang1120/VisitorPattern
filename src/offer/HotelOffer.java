package offer;

import creditcard.CreditCard;

public class HotelOffer implements OfferVistor{
    @Override
    public void calculateDiscountForGoldenCard(CreditCard creditCard) {
        System.out.println("Hotel discount for golden card is 3%" );
    }

    @Override
    public void calculateDiscountForSilverCard(CreditCard creditCard) {
        System.out.println("Hotel discount for silver card is 2%" );
    }

    @Override
    public void calculateDiscountForNormalCard(CreditCard creditCard) {
        System.out.println("Hotel discount for normal card is 1%" );
    }
}
