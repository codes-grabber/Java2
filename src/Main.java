public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("murzik");
        Jampable[] jampables = {
                new Cat("murzik"),
                new Cat("Vasia"),
                new Kangaroo("zusa")
        };

        for (int i = 0; i< jampables.length; i++){
            jampables[i].jump();
        }
        tryJump(cat);
        tryRun(cat, 5);

        Mouse m = new Mouse("Jerry");
        tryJump(m);
    }

    static void tryRunAndJump (JumpRunnable r, int distance){
        r.run(distance);
        r.jump();
    }

    static void tryRun(Runnanle r, int distance){
        r.run(distance);
    }

    static void tryJump(Jampable j){

        j.jump();
    }
}
