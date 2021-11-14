public class Kangaroo implements Jampable{
private String name;

Kangaroo(String name){
    this.name = name;
}
    @Override
    public void jump() {
        System.out.println(name + " jump!");
    }
}
