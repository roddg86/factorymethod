package controller;

import model.Car;
import model.impl.IProduction;
import model.impl.IWorkShop;

/**
 * Класс представляет цех по производству легковых автомобилей
 *
 * метод create возвращает экземпляр легкового автомобиля
 */
public class CarWorkShop implements IWorkShop {
    @Override
    public IProduction create() {
        return new Car();
    }
}
