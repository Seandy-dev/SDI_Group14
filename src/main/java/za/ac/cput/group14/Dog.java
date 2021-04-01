package za.ac.cput.group14;

/*
 *@Author: Thina Mbiza
 * Student Number: 217217095
 * Date: 1 April 2021
 * This is the main class for the Dog class
 */
public class Dog {

    private String name;

    public Dog() {
    }

    public Dog(String n) {
        this.name = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + '}';
    }
}

