import java.util.Objects;

public class Plants extends Placeable implements Alive, Thinkable {

    private String name;

    public Plants(Place currentPosition, String name) {
        super(currentPosition);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plants plants = (Plants) o;
        return Objects.equals(name, plants.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
