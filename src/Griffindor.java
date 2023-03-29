public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int powerOfWitchcraft, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfWitchcraft, transgressionDistance);
        if (nobility >= 0 && nobility <= 100 &&
                honor >= 0 && honor <= 100 &&
                bravery >= 0 && bravery <= 100) {
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        } else {
            throw new RuntimeException("Значение должно быть от 0 до 100");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
