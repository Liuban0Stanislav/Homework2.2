public class Hufflepuff extends Hogwards {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerOfWitchcraft, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, powerOfWitchcraft, transgressionDistance);
        if (hardworking >= 0 && hardworking <= 100 &&
                loyal >= 0 && loyal <= 100 &&
                honest >= 0 && honest <= 100) {
            this.hardworking = hardworking;
            this.loyal = loyal;
            this.honest = honest;
        } else {
            throw new RuntimeException("Значение должно быть от 0 до 100");
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
