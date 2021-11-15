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

        JumpRunnable[] jr = {
                new Cat("murzik"),
                new Cat("Vasia"),
                new Kangaroo("zusa")
        };

        for (int i = 0; i< jr.length; i++){
            jr[i].jump();
            jr[i].run(5);
            jr[i].superJump();
        }



        tryJump(cat);
        tryRun(cat, 5);

        //----------------------Функциональные интерфейсы--------------------/

        Runnanle r = new Runnanle() {
            @Override
            public void run(int dist) {
                System.out.println("run " + dist);
            }
        };
            //аналогия (явное выражение)
        Runnanle r1 = (dist) ->
                System.out.println("run " + dist);


        tryRun(r, 3);
        tryRun(r1, 3);

        //----------------------Функциональные интерфейсы--------------------\
    }


//    JumpRunnable jr1 = new JumpRunnable() { //Реализуем методы в моменте. Для него создается отдельный анонимный класс в папке out
//        @Override
//        public void jump() {
//            System.out.println("fdfdsfsfs");
//        }
//
//        @Override
//        public void run(int dist) {
//            System.out.println("fdfsdfsf fs");
//        }
//    };









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
