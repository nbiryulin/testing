public class GoldenHeart extends SpaceShip {


    public GoldenHeart(int speed, Place currentPlace) {
        super(speed, currentPlace);
    }

    @Override
    void fly(Place place, long limit) {
        double distance = countDistance(place);
        while (distance > 0 && limit > 0) {
            try {
                Thread.sleep(1000);
                limit -= 1000;
                distance -= distance / speed;
                super.setCurrentPosition(getCloser(place));
            } catch (InterruptedException e) {
                System.out.println("Stop");
                return;
            }
        }
    }

}