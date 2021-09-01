package by.tms.lesson10;

import java.util.Objects;

public abstract class Animal {

    private int weight;
    private int age;
    private String name;
    private char gender;

    public Animal(int weight, int age, String name, char gender) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight &&
                age == animal.age &&
                gender == animal.gender &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, age, name, gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}