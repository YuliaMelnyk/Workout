package com.example.workout;

/**
 * @author yuliiamelnyk on 09/05/2020
 * @project Workout
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("first", "one"),
            new Workout("second", "two"),
            new Workout("third", "three"),
            new Workout("fifth", "five")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
