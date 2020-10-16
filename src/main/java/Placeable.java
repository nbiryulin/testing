public class Placeable {

    private Place currentPosition;

    public Placeable(Place currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Place getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Place currentPosition) {
        this.currentPosition = currentPosition;
    }

    public double countDistance(Place to) {
        return Math.sqrt(
                sqrOfDif(currentPosition.x, to.x) +
                        sqrOfDif(currentPosition.y, to.y) +
                        sqrOfDif(currentPosition.z, to.z));
    }

    private double sqrOfDif(double a, double b) {
        return Math.pow(b, 2) - Math.pow(a, 2);
    }
}
