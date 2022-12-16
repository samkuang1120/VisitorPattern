import creditcard.CreditCard;
import creditcard.GoldenCard;
import creditcard.NormalCard;
import creditcard.SilverCard;
import offer.ClothesOffer;
import offer.HotelOffer;
import offer.OfferVistor;
import offer.TrafficOffer;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new GoldenCard();
        CreditCard creditCard1 = new SilverCard();
        CreditCard creditCard2 = new NormalCard();

        OfferVistor offer = new HotelOffer();
        OfferVistor offer1 = new ClothesOffer();
        OfferVistor offer2 = new TrafficOffer();

        System.out.println("Offer Table begin -------------------------");
        creditCard.accept(offer);
        creditCard1.accept(offer1);
        System.out.println("Offer Table end ----------------------------");
    }
}