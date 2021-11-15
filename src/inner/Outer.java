package inner;
//внутренние классы
public class Outer {
    Inner[] inners;
    Inner in;
    int a = 5;

    public Outer() {
        inners = new Inner[]{
                new Inner(1,5),
                new Inner(7,5),
                new Inner(8,1),
        };
        in = new Inner(7,5);

    }

    class Inner{
        int x;
        int y;

        public Inner(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void printA(){
            System.out.println(a);
        }
    }

    static class StClass{
        public void someMethod(){
            System.out.println("sdadadasdaddss");
        }
    }
}
