package model;

public abstract class Food {
    protected int amount; //количество
    protected double price; //цена
    protected boolean isVegetarian; //является ли продукт вегетарианским

    public int getAmount(){
        return amount;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }
}
