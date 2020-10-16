public class Effects implements Thinkable {

    private Thinkable effectsOf;

    public Effects(Thinkable effectsOf) {
        this.effectsOf = effectsOf;
    }

    public Thinkable getEffectsOf() {
        return effectsOf;
    }
}
