public class Card {

    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit){
        this.face=cardFace;
        this.suit=cardSuit;
    }
    //toString() ile iki değer birleştirilip geriye döner
    public String toString(){
        return face + "of" + suit;
    }
}


