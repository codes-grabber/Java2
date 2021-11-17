public class MyArraySizeException extends IllegalArgumentException {
    private int h;
    private int w;

    public MyArraySizeException(String s, int h, int w) {
        super(s);
        this.h = h;
        this.w = w;
    }

    public int getHight(){
        return h;
    }

    public int getWeight(){
        return w;
    }
}
