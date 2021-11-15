
@FunctionalInterface
public interface Jampable {
    void jump();

    default void superJump(){ //default нужен чтобы не ломался код при добавлении метода
        System.out.println("superJump default impl");
    }
}
