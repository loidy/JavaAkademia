package sk.akademia;

public abstract class Shape {
    private char color;

    public Shape() {
        this.color = '*';
    }

    public Shape(char color) {
        this.color = color;
    }

    public abstract void print();

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
