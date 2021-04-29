package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int numberOfDamage = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        numberOfDamage++;
        if (numberOfDamage == 1) {
            return super.doDamage() * 3;
        } else {
            return super.doDamage();
        }
    }
}