package offer;

import creditcard.CreditCard;

public class ClothesOffer implements OfferVistor{
    @Override
    public void calculateDiscountForGoldenCard(CreditCard creditCard) {
        System.out.println("Clothes discount for golden card is 10%" );
    }

    @Override
    public void calculateDiscountForSilverCard(CreditCard creditCard) {
        System.out.println("Clothes discount for golden card is 8%" );
    }

    @Override
    public void calculateDiscountForNormalCard(CreditCard creditCard) {
        System.out.println("Clothes discount for golden card is 3%" );
    }
}
