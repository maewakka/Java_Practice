package Object.Equals;

public class EqualsEx2 {

    public void Execute() {
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1 == p2)
            System.out.println("p1은 p2와 같습니다.");
        else
            System.out.println("p1은 p2와 다릅니다.");

        if(p1.equals(p2))
            System.out.println("p1은 p2와 같습니다.");
        else
            System.out.println("p1은 p2와 다릅니다.");
    }


    class Person {
        long id;

        public boolean equals(Object obj) {
            if(obj instanceof Person)
                return id==((Person)obj).id; // 파라미터로 받은 Person 객체의 id값과 해당 객체의 id값을 비교
            else
                return false;
        }

        Person(long id) {
            this.id = id;
        }
    }
}
