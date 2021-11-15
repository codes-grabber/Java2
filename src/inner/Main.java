package inner;

public class Main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner(3,4);

        Outer.StClass st = new Outer.StClass();
        st.someMethod();
    }

    public void method1(){
        class LocalClass{
            int a;

            public LocalClass(int a){
                this.a = a;
            }

            int sqr(){
                return a*a;
            }
        }
        LocalClass lc = new LocalClass(3);
    }


}
