package org.example.Lecture1.Game.model;

public class Priest extends HeroBase{
    private int maxElixir;
    private int currentElixir;
    private Double damageIndex = 1.0;
    private Double protectIndex = 0.6;
    private  Double healIndex = 1.2;


    public Priest(String name) {
        super(name);
        this.heroType = getClass().getSimpleName();
        this.maxElixir = 100;
        this.currentElixir = maxElixir;
        this.damageAbility = super.getDamageAbility() * this.damageIndex;
        this.protectAbility = super.getProtectAbility() * this.protectIndex;
        this.healAbility = super.getHealAbility() * this.healIndex;
    }

    public Priest() {
        this("Hero_" + idNum.toString());
    }
}
