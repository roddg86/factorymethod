package model;

import model.impl.IProduction;

/**
 * Конкретный класс легкового автомобиля
 */
public class Car implements IProduction {

    @Override
    public void release() {
        System.out.println("Выпущен новый грузовой автомобиль");
    }
}
