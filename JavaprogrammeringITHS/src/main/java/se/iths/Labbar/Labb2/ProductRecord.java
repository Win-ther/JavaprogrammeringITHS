package se.iths.Labbar.Labb2;

import java.math.BigDecimal;
import java.util.UUID;
public record ProductRecord(UUID uuid, String name, Category category, BigDecimal price) { }
