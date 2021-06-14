package models;

public class Rectangle {
    private Double length;
    private Double width;

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getArea() {
        return length*width;
    }

    public Double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public String toString() {
        return  "\n Length of Rectangle = " + length +
                "\n Width of Rectangle = " + width +
                "\n Area of Rectangle = " + getArea() +
                "\n Perimeter of Rectangle = " + getPerimeter();
    }
}
