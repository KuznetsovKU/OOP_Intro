package org.example.Seminar3.CwCats.Animals;

public class Cat extends Animal{
    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    public Cat(String name) {
        super(name, 1, 5);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
