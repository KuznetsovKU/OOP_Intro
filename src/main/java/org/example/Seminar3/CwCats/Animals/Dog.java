package org.example.Seminar3.CwCats.Animals;

public class Dog extends Animal{
    public Dog(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    public Dog(String name) {
        super(name, 1, 4);
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
