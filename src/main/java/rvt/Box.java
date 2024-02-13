package rvt;

import java.util.ArrayList;

public class Box {
    private int capacity;

    private ArrayList<Packable> items;

    public Box(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        items.add(item);
    }

    public String toString() {
        double totalWeight = 0;
        for(Packable item : items) {
            totalWeight += item.weight();
        }
        return "Box " + this.items.size() + " items, totla weight " + totalWeight + " kg";
    }
}
