package lesson19;

import java.io.Serializable;

/**
 * Created by student on 2/25/2018.
 */
public class Halter implements Serializable {
    private String color;

    public Halter(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Halter halter = (Halter) o;

        return color != null ? color.equals(halter.color) : halter.color == null;

    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Halter{" +
                "color='" + color + '\'' +
                '}';
    }
}
