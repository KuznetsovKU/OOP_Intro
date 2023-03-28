package org.example.Lecture1.Game.model.Characters;

import java.util.Random;

public abstract class HeroBase {
    protected static Random rand;
    protected static Integer idNum;
    static {
        HeroBase.idNum = 1;
        HeroBase.rand = new Random();
    }

    protected Integer id;
    protected String heroType;
    protected String name;
    protected Integer level;
    protected Integer maxHP;
    protected Integer currentHP;
    protected Integer experiencePoints;
    protected Double damageAbility;
    protected double protectAbility;
    protected double healAbility;
    protected Integer levelUpBorder;
    protected int lifeStatus;

    protected HeroBase(String name) {
        this.id = idNum++;
        this.heroType = "no type";
        this.name = name;
        this.level = 1;
        this.maxHP = 100;
        this.currentHP = maxHP;
        this.experiencePoints = 0;
        this.damageAbility = 1.0;
        this.protectAbility = 1.0;
        this.healAbility = 1.0;
        this.levelUpBorder = 100;
        this.lifeStatus = 1;
    }

    protected HeroBase() {
        this("Hero_" + idNum.toString());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", level=" + level +
                ", currentHP=" + currentHP +
                ", experiencePoints=" + experiencePoints;
    }

    public String getFullInfo() {
        return this.toString() +
                ", maxHP=" + maxHP +
                ", damageIndex=" + damageAbility +
                ", protectIndex=" + protectAbility +
                ", healIndex=" + healAbility +
                ", id=" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentHP() {
        return currentHP;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }


    public Double getDamageAbility() {
        return damageAbility;
    }

    public double getProtectAbility() {
        return protectAbility;
    }

    public double getHealAbility() {
        return healAbility;
    }

    public int getLifeStatus() {
        return lifeStatus;
    }

    protected void getHealed(int plusHP) {
        if (this.currentHP + plusHP >= this.maxHP) {
            this.currentHP = this.maxHP;
        } else {
            this.currentHP += plusHP;
        }
    }

    protected void getDamage(int minusHP) {
        if (this.currentHP - minusHP <= 0) {
            this.currentHP = 0;
            this.getDied();
        } else {
            this.currentHP -= minusHP;
        }
    }

    public void attack(HeroBase target) {
        int damage = HeroBase.rand.nextInt((int) Math.round((30 * this.getDamageAbility()) / target.getProtectAbility()));
        System.out.println("Hero " + this.getName() + " damaged " + target.getName() + " on " + damage + " points");
        target.getDamage(damage);
        this.experiencePoints += damage * 2;
        if (this.experiencePoints >= this.levelUpBorder) {
            this.levelUp();
        }
        System.out.println();
    }

    private void levelUp() {
        this.level++;
        this.experiencePoints = 0;
        this.levelUpBorder += 100;
        this.maxHP += 10;
        this.currentHP = maxHP;
        this.damageAbility += level / 20.0;
        this.protectAbility += level / 20.0;
        this.healAbility += level / 20.0;
        System.out.println("Hero " + this.getName() + " got new level: " + this.level);
    }

    private void getDied() {
        System.out.println("Hero " + this.getName() + " is died ");
        this.damageAbility = 0.0;
        this.protectAbility = 0.0;
        this.healAbility = 0.0;
        this.lifeStatus = 0;
    }


}
