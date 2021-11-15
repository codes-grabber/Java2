public class Cat implements JumpRunnable{
    private  String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул");
    }

    @Override
    public void run(int dist) {
        System.out.println(name + " run " + dist + " метров");
    }
}
