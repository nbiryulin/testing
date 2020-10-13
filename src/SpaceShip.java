public abstract class SpaceShip extends Placeable {

    int speed;

    public SpaceShip (int speed, Place currentPlace) {
        super(currentPlace);
        this.speed = speed;
    }

    abstract void fly(Place place);
}
