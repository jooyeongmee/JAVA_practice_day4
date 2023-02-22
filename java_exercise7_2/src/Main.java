class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < cards.length; i++) {
            if (i >= 10) {
                int j = i - 10;
                cards[i] = new SutdaCard(j+1, false);
            } else {

                if (i == 0 || i == 2 || i == 7) {
                    cards[i] = new SutdaCard(i +1, true);
                }
                else {
                    cards[i] = new SutdaCard(i +1, false);
                }
            }

        }
    }

    void shuffle() {
        // (구현)
        for (int i = 0; i < cards.length; i++) {
            SutdaCard temp = cards[0];
            int idx = (int)(Math.random() * cards.length);
            cards[0] = cards[idx];
            cards[idx] = temp;
        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard pick() {
        // (구현)
        int idx = (int)(Math.random() * cards.length);
        return cards[idx];
    }
} // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과) 
// 1K
// 7 
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K, 
// 2