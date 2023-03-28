package org.example.Lecture1.Game.model.Characters;

public class Magician extends HeroBase {
    private int maxMana;
    private int currentMana;
    private Double damageIndex = 0.8;
    private Double protectIndex = 0.8;
    private  Double healIndex = 1.0;

    public Magician(String name) {
        super(name);
        this.heroType = getClass().getSimpleName();
        this.maxMana = 100;
        this.currentMana = maxMana;
        this.damageAbility = super.getDamageAbility() * this.damageIndex;
        this.protectAbility = super.getProtectAbility() * this.protectIndex;
        this.healAbility = super.getHealAbility() * this.healIndex;
    }

    public Magician() {
        this("Hero_" + idNum.toString());
    }
}
