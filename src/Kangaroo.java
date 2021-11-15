public class Kangaroo implements JumpRunnable{
private String name;

Kangaroo(String name){
    this.name = name;
}
    @Override
    public void jump() {
        System.out.println(name + " jump!");
    }

    @Override
    public void run(int dist) {
        System.out.println(name + " run " + dist + " метров");
    }
}

