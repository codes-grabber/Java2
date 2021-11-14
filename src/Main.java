public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("murzik");
        Jampable[] jampables = {
                new Cat("murzik"),
                new Kangaroo("zusa")
        };

        for (int i = 0; i< jampables.length; i++){
            jampables[i].jump();
        }
        tryJump(cat);
    }
    static void tryJump(Jampable j){
        j.jump();
    }
}
