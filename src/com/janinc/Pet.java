package com.janinc;

/*
Programmerat av Jan-Erik "Janis" Karlsson 2020-01-29
Programmering i Java EMMJUH19, EC-Utbildning
CopyLeft 2020 - JanInc
*/

import com.janinc.enums.Gender;
import com.janinc.enums.PetTypes;

import java.io.Serializable;

public class Pet implements Serializable {
    public static final long serialVersionUID = 4242L;

    private String name;
    private Gender gender;
    private PetTypes type;

    public Pet(Name name, PetTypes type) {
        this.name = name.getName();
        this.gender = name.getGender();
        this.type = type;
    } // Pet

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public PetTypes getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%s is a %s", name, type);
    }
} // class Pet
