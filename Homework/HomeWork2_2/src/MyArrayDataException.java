public class MyArrayDataException  extends IllegalArgumentException{
    private int h;
    private int w;

    public MyArrayDataException(int h, int w) {
        super(String.format("Преобразование не удалось в координатах %d строка, %d столбец", h, w));
    }

    public int getHight(){
        return h;
    }

    public int getWeight(){
        return w;
    }
}
