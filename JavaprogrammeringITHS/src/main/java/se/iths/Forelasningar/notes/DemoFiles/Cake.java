package se.iths.Forelasningar.notes.DemoFiles;

import java.io.Serializable;

public record Cake(int id, String name, int price) implements Serializable {
}
