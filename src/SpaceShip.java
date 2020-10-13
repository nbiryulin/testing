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

    public SpaceShip (int speed, Place currentPlace) {
        super(currentPlace);
        this.speed = speed;
    }

    abstract void fly(Place place);
}
