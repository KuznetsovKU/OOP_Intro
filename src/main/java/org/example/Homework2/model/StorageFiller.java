package org.example.Homework2.model;

import org.example.Homework2.model.Laptops.Laptop;

import java.util.List;

public interface StorageFiller {
    /**
     * Метод добавления отдельного ноутбука на склад
     *
     * @param laptop - ноутбук, который, необходимо добавить
     */
    void addToStorage(Laptop laptop);

    /**
     * Метод, позволяющий вывести в консоль содержимое конкретного склада
     */
    void printStorage();

    /**
     * Метод наполнения склада "случайными" ноутбуками
     *
     * @param amount - количество ноутбуков
     * @return - склад (List<Laptop>) заполненный "случайными" ноутбуками
     */
    Storage createRandomStorage(int amount);

    /**
     * Метод создания отфильтрованного списка ноутбуков в соответствии с запросом клиента
     *
     * @param storage - начальный (общий) список ноутбуков
     * @return - новый "отфильтрованный" список
     */
    Storage getFilteredStorage(Storage storage);

}
