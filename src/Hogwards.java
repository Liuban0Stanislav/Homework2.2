public abstract class Hogwards  {
    private String name;
    private int powerOfWitchcraft;
    private int transgressionDistance;

    public Hogwards(String name, int powerOfWitchcraft, int transgressionDistance) {
        this.name = name;
        if (powerOfWitchcraft >= 0 && powerOfWitchcraft <= 100 &&
                transgressionDistance >=0 && transgressionDistance <= 100) {
            this.powerOfWitchcraft = powerOfWitchcraft;
            this.transgressionDistance = transgressionDistance;
        } else {
            throw new RuntimeException("Значение должно быть от 0 до 100");
        }
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
