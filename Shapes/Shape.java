public interface Shape {
    double calculatePerimeter();

    double calculateArea();
}

public interface Fillable {
    void setFillColor(String color);
}

public interface Borderable {
    void setBorderColor(String color);
}