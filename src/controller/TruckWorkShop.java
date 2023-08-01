package controller;

import model.impl.IProduction;
import model.impl.IWorkShop;
import model.Truck;

/**
 * Класс представляет абстрактный цех по производству
 * грузовых автомобилей
 *
 * метод create возвращает экземпляр грузового автомобиля
 */
public class TruckWorkShop implements IWorkShop {
    @Override
    public IProduction create() {
        return new Truck();
    }
}
