public class Mouse implements Jampable{

    private  String name;

    Mouse(String name){
        this.name = name;
    }

    public void jump() {
        System.out.println(name + " jump!");
    }
}
