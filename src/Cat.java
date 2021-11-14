public class Cat implements Jampable{
    private  String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + " jump!");
    }
}
