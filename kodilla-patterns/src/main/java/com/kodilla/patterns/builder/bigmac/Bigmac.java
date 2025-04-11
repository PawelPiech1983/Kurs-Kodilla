package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    public static final String SALAD = "Salad";
    public static final String ONION = "Onion";
    public static final String BEACON = "Beacon";
    public static final String CUCUMBER = "Cucumber";
    public static final String CHILLIPEPPER = "Chillipepper";
    public static final String MUSHROOMS = "Mushrooms";
    public static final String SHRIMP = "Shrimp";
    public static final String CHEESE = "Cheese";

    private final boolean bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public Bigmac(boolean bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sause='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burgers(int burgers) {
            if (burgers < 3 && burgers > 0) {
                this.burgers = burgers;
            }
            else {
                throw new IllegalStateException("You can choose 1 or 2 burgers!");
            }
            return this;
        }
        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient(String ingredient) {
            if(ingredient.equals(SALAD) || ingredient.equals(ONION) || ingredient.equals(BEACON) || ingredient.equals(CUCUMBER) || ingredient.equals(CHILLIPEPPER) || ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMP) || ingredient.equals(CHEESE)) {
                this.ingredients.add(ingredient);
            }
            else {
                throw new IllegalStateException("Wrong ingredient type. Please choose a valid ingredient: Salad, Onion, Beacon, Cucumber, Chillipepper, Mushrooms, Shrimp, Cheese");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
}
