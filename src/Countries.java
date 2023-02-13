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

    public static Measurable maximum(Measurable[] objects) {
        Measurable result = objects[0];
        for (int i = 0; i < objects.length; i++) {
            if (result.getMeasure() < objects[i].getMeasure()) {
                result = objects[i];
            }
        }
        return result;
    }

}
