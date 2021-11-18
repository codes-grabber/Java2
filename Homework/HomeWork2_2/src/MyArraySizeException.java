public class MyArraySizeException extends IllegalArgumentException {
    private int h;
    private int w;

    public MyArraySizeException() {
        super(String.format("Массив некорректного размера "));
    }
}
