import java.util.Objects;

public abstract class SpaceShip extends Placeable {

    int speed;

    Cabin cabin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceShip spaceShip = (SpaceShip) o;
        return speed == spaceShip.speed &&
                cabin.equals(spaceShip.cabin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, cabin);
    }

    public SpaceShip(int speed, Place currentPlace) {
        super(currentPlace);
        this.speed = speed;
    }

    abstract void fly(Place place, long limit);

    public Place getCloser(Place place) {
        Place current = getCurrentPosition();
        current.x = getCloser(current.x, place.x, speed);
        current.y = getCloser(current.y, place.y, speed);
        current.z = getCloser(current.z, place.z, speed);
        return current;
    }

    public double getCloser(double from, double to, int speed) {
        double tmp;
        if (Math.abs(from - to) < 0.1 * speed) {
            return to;
        } else {
            if (from > to) {
                tmp = from - 0.1 * speed;
            } else if (from < to) {
                tmp = from + 0.1 * speed;
            } else {
                tmp = to;
            }
            return tmp;
        }
    }
}
