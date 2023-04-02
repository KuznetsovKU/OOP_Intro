package org.example.Homework2;

import org.example.Homework2.model.Storage;

public class Main {
    public static void main(String[] args) {
        Storage myStorage = new Storage().createRandomStorage(10);
        myStorage.printStorage();

        Storage clientChoice = new Storage().getFilteredStorage(myStorage);
        clientChoice.printStorage();

    }
}
