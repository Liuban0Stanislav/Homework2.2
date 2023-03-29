public class Slytherin extends Hogwards {
    private int cunning;
    private int determination;
    private int resourcefulness;
    private int thirstForPower;
    private int ambushes;

    public Slytherin(String name, int powerOfWitchcraft, int transgressionDistance,
                     int cunning, int determination, int resourcefulness, int thirstForPower, int ambushes) {
        super(name, powerOfWitchcraft, transgressionDistance);
        if (cunning >= 0 && cunning <= 100 &&
                determination >= 0 && determination <= 100 &&
                resourcefulness >= 0 && resourcefulness <= 100 &&
                thirstForPower >= 0 && thirstForPower <= 100) {
            this.cunning = cunning;
            this.determination = determination;
            this.resourcefulness = resourcefulness;
            this.thirstForPower = thirstForPower;
            this.ambushes = ambushes;
        } else {
            throw new RuntimeException("Значение должно быть от 0 до 100");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public int getAmbushes() {
        return ambushes;
    }

    public void setAmbushes(int ambushes) {
        this.ambushes = ambushes;
    }
}
