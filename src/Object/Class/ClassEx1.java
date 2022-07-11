package Object.Class;

public class ClassEx1 {

    public void Execute() throws Exception {
        Card c = new Card("HEART", 3);
//        Card c2 = Card.class.newInstance();

        Class cobj = c.getClass();

        System.out.println(c);
//        System.out.println(c2);
        System.out.println(cobj.getName());
        System.out.println(cobj.toGenericString());
        System.out.println(cobj.toString());

    }

    final class Card {
        String kind;
        int number;

        Card() {
            this("SPADE", 1);
        }

        Card(String kind, int number) {
            this.kind = kind;
            this.number = number;
        }
    }

}
