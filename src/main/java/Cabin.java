import java.util.Objects;

public class Cabin extends Placeable implements Thinkable {

   private int id;

    public Cabin(Place currentPosition, int id) {
        super(currentPosition);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cabin cabin = (Cabin) o;
        return id == cabin.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
