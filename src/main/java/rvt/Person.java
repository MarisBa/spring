package rvt;

class Person {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Override toString() method to provide a custom string representation
    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
