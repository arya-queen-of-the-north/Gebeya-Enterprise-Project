package com.gebeya.Excercises;

public class AnimalHome<T> {
    T animal;

    public AnimalHome(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
