package org.example.Homework2.model.Laptops;

public interface LaptopActions {

    /**
     * Метод генерации псевдо-случайного ноутбука
     *
     * @return - экземпляр класса Laptop, сгенерированный псевдо-случайным образом
     */
    Laptop createRandomLaptop();

    /**
     * Метод ручного создания экземпляра класса Laptop
     *
     * @return - экземпляр класса Laptop, сгенерированный вручную
     */
    Laptop createLaptopManually();

    /**
     * Метод сравнения двух ноутбуков
     *
     * @param laptop - ноутбук, с которым сравниваем
     * @return - результат сравнения
     */
    boolean isEqualsLaptop(Laptop laptop);

}
