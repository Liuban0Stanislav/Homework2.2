public class Ravenclaw extends Hogwards {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int powerOfWitchcraft, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, powerOfWitchcraft, transgressionDistance);
        if (smart >= 0 && smart <= 100 &&
                wise >= 0 && wise <= 100 &&
                witty >= 0 && witty <= 100 &&
                creative >= 0 && creative <= 100) {
            this.smart = smart;
            this.wise = wise;
            this.witty = witty;
            this.creative = creative;
        } else {
            throw new RuntimeException("Значение должно быть от 0 до 100");
        }
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
