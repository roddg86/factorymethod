package model;

import model.impl.IProduction;

/**
 * Конкретный класс грузового автомобиля
 */
public class Truck implements IProduction {
    @Override
    public void release() {
        System.out.println("Выпущен новый легковой и грузовой автомобиль");
    }
}
