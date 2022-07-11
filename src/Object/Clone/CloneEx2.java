package Object.Clone;

public class CloneEx2 {

    public void Execute() {
        Circle c1 = new Circle(new Point(1,1), 2);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.p.x = 3;
        c1.p.y = 5;

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
    class Circle implements Cloneable {
        Point p;
        double r;

        Circle(Point p, double r) {
            this.p = p;
            this.r = r;
        }

        public Circle shallowCopy() {
            Object obj = null;
            try {
                obj = super.clone();
            } catch (CloneNotSupportedException e) {}

            return (Circle)obj;
        }

        public Circle deepCopy() {
            Object obj = null;

            try {
                obj = super.clone();
            } catch (CloneNotSupportedException e) {}

            Circle c = (Circle)obj;
            c.p = new Point(this.p.x, this.p.y);
            c.r = this.r;

            return c;
        }

        public String toString() {
            return "p = " + this.p + ", r is " + this.r;
        }
    }

    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x is " + x + ", y is " + y;
        }
    }
}
