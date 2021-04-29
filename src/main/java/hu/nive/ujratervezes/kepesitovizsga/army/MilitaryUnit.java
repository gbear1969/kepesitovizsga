package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    private int hitPoints;
    private int damage;
    private boolean Armoured;

    public MilitaryUnit(int hitPoints, int damage, boolean Armoured) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.Armoured = Armoured;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage){
        if (Armoured == true) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean Armoured() {
        return Armoured;
    }
}
