package main.java;

public abstract class Nebula extends Placeable {

    private String name;

    public Nebula(Place currentPosition, String name) {
        super(currentPosition);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
