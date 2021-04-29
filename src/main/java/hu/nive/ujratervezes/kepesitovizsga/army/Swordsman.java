package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private boolean isShield = true;

    public Swordsman(boolean Armoured) {
        super(100, 10, Armoured);
    }

    @Override
    public void sufferDamage(int damage) {
        if (isShield == true) {
            isShield = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}