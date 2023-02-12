public class Countries implements Measurable {

    private double measure;

    public Countries(double measure) {
        this.measure = measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    @Override
    public double getMeasure() {
        return measure;
    }

    public double[] newArray(double a, double b, double c, double d) {
        double[] array = new double[] {a, b, c, d};
        return array;
    }


}
