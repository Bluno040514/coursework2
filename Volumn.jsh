public class Volumn {
    public static double sphere(double d) {
        double r = d / 2;
        double v = (4.0 / 3) * Math.PI * r*r*r;
        System.out.println("Volumn ="+v);
        return v;
    }

    public static void main(String[] args) {
            sphere(20.24);
        }


}
