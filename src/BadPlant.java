public class BadPlant implements Entity {
    private final int defEnergy;

    public BadPlant(int defEnergy) {
        this.defEnergy = defEnergy;
    }

    @Override
    public void updateEnergy(int delta) {

    }

    @Override
    public int getEnergy() {
        return 0;
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public String toString() {
        return "BadPlant{" +
                "defEnergy=" + defEnergy +
                '}';
    }
}
