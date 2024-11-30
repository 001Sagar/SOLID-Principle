
import java.util.Stack;

// Definition: A class should not be forced to implement interfaces it does not use.

public class InterfaceSagementedPrinciple {

    // Code without using interface
    // public static interface worker {
    // void work();
    // void eat();
    // }

    // public static class Robot implements worker{

    // public void work(){
    // System.out.println("Robot Works");
    // }

    // public void eat(){
    // throw new UnsupportedOperationException("Robot Don't Eat");
    // }
    // }

    public interface Work {
        public void work();
    }

    public interface Eat {
        public void eat();
    }

    static class Human implements Work, Eat {

        @Override
        public void work() {
            System.out.println("Workers work Hard");
        }

        @Override
        public void eat() {
            System.out.println("Eat Food");
        }
    }

    static class Robot implements Work {

        public void work() {
            System.out.println("Robots Work Hard");
        }
    }

    public static void main(String[] args) {

        Work h1 = new Human();
        Eat h2 = new Human();
        Work r1 = new Robot();

        h1.work();
        h2.eat();
        r1.work();

    }

}
