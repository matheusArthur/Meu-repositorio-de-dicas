package membros_estaticos.exe2.calculo;

public class volume1 {
    public final double PI = 3.14159;
    public double circumference(double radius) {
        return 2 * PI * radius;
    }
    public double volume (double radius) {
        return 4 * PI * radius * radius * radius/3;
    }
}
