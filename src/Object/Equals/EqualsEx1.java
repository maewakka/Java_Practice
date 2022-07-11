package Object.Equals;

public class EqualsEx1 {

    public void Execute() {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1.hashCode());

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }


    class Value {
        int value;

        Value(int value) {
            this.value = value;
        }
    }
}