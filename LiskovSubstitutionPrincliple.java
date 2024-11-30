// The Liskov Substitution Principle (LSP) is about ensuring that a subclass can be used in place of its parent class without breaking the application. In simple terms, it means:

//"If you have a parent class, you should be able to replace it with a subclass and everything should still work as expected."

public class LiskovSubstitutionPrincliple {

    public static interface IsColor {
        abstract void isColor();
    }

    public static class Green implements IsColor {

        public void isColor() {
            System.out.println("Green Color");
        }
    }

    public static class Blue implements IsColor {

        public void isColor() {
            System.out.println("Blue Color");
        }
    }

    public static class White implements IsColor {

        public void isColor() {
            System.out.println("White Color");
        }
    }

    public static void main(String[] args) {

        IsColor g1 = new Green();
        IsColor w1 = new White();
        IsColor b1 = new Blue();

        g1.isColor();
        w1.isColor();
        b1.isColor();

    }
}
