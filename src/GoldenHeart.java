public class GoldenHeart extends SpaceShip {


    public GoldenHeart(int speed, Place currentPlace) {
        super(speed, currentPlace);
    }

    @Override
    void fly(Place place) {
        double distance = countDistance(place);
    }

}