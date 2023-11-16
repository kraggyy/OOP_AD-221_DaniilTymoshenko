package laba6.carshop.interfaces;

public interface Customer {
    double getCarsPrice();

    String getCarColors();

    double getCarPrice(int id);

    String getCarColor(int id);

    void purchaseCar(int id);
}
