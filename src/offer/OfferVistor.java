package offer;

import creditcard.CreditCard;

public interface OfferVistor {
    void calculateDiscountForGoldenCard(CreditCard creditCard);
    void calculateDiscountForSilverCard(CreditCard creditCard);
    void calculateDiscountForNormalCard(CreditCard creditCard);
}
