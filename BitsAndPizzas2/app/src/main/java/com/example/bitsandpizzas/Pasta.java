package com.example.bitsandpizzas;

/**
 * @author yuliiamelnyk on 30/06/2020
 * @project BitsAndPizzas
 */
public class Pasta {

    private String name;
    private int imageResourceId;

    public static final Pasta [] pastas = {
            new Pasta("Spaghetti",R.drawable.spaghetti),
            new Pasta("Lasagne", R.drawable.lasagne)
    };

    public Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
