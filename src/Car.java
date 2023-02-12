public class Car {
    private double fuelEfficiency;
    private double fuelLevel;
    private int distance;

    public Car(int efficiency) {
        fuelEfficiency = Double.valueOf(efficiency);
        fuelLevel = 0;
        distance = 0;
    }

    public int getDistance() {
        return distance;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double addFuel(int a) {
        this.fuelLevel = this.fuelLevel + Double.valueOf(a);
        return fuelLevel;
    }

    public double drive(int b) {
        setDistance(b);
        this.fuelLevel = this.fuelLevel - this.distance / this.fuelEfficiency;
        return fuelLevel;
    }



}
