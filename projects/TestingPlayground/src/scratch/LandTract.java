package scratch;

public class LandTract {
    private int length;
    private int width;

    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //copy constructor
    public LandTract(LandTract lt) {
        this.length = lt.length;
        this.width = lt.width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return getLength() * getWidth();
    }

    public boolean equals(LandTract lt) {
        return area() == lt.area();
    }

    public String toString() {
        return "Length: " + getLength() + ", Width: " + getWidth() + ", Area: " + area();
    }

}
