package com.janinc;

/*
Programmerat av Jan-Erik "Janis" Karlsson 2020-02-10
Programmering i Java EMMJUH19, EC-Utbildning
CopyLeft 2020 - JanInc
*/

import java.util.ArrayList;
import java.util.List;

public class ReadProgram {
    PetStore store;

    ReadProgram() {
        store = (PetStore) FileHandler.readFile("store", PetStore.FILE_NAME);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("De-serializing the store");
        System.out.println(store);

        System.out.println("\n--------------------------------------------------------");
        System.out.println("De-serializing shoppers");
        List<Person> shoppers = new ArrayList<>();
        shoppers = (List<Person>) FileHandler.readFile("shoppers", "shoppers.ser");
        System.out.println(shoppers);
    } // ReadProgram
} // class saves/store.ser
