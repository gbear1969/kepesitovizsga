package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
        private List<MilitaryUnit> army = new ArrayList<>();

        public List<MilitaryUnit> getUnits() {
            return new ArrayList<>(List.copyOf(army));
        }

        public void addUnit(MilitaryUnit militaryUnit) {
            army.add(militaryUnit);
        }

        public int getArmySize() {
            return army.size();
        }

        public int getArmyDamage() {
            int sum = 0;
            for (MilitaryUnit unit: army) {
                sum += unit.doDamage();
            }
            return sum;
        }

        public void damageAll(int damage) {
            List<MilitaryUnit> newArmy = new ArrayList<>();
            for (MilitaryUnit unit: army) {
                unit.sufferDamage(damage);
                if (unit.getHitPoints() > 24) {
                    newArmy.add(unit);
                }
            }
            army = newArmy;
        }
}
