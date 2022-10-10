package sk.akademia;

public class Line extends Shape {
    private int size;

    public Line(int size) {
        this.size = size;
    }

    public Line(char color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void print() {
//        System.out.println("Line of size " + this.size);
        for (int i = 0; i < this.size; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
