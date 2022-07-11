package Object.Clone;

public class CloneEx1 {

    public void Execute() {
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone();
        System.out.println(original.toString());
        System.out.println(copy.toString());
    }

    class Point implements Cloneable {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x is " + x + ", y is " + y;
        }

        public Point clone() {
            Object obj = null;
            try {
                obj = super.clone();
            } catch (CloneNotSupportedException e) {}

            return (Point)obj;
        }
    }

}
