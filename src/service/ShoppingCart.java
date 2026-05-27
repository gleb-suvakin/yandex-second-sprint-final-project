package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = foods;
    }

    //Общая сумма без скидки
    public double getTotalWithoutDiscount(){
        double sum = 0;
        for (int i=0; i < foods.length; i++){
            sum = sum + (foods[i].getAmount()*foods[i].getPrice());
        }
        return sum;
    }

    //Общая сумма со скидкой
    public double getTotalWithDiscount(){
        double sum = 0;
        for (int i=0; i < foods.length; i++){
            double itemTotal = foods[i].getAmount() * foods[i].getPrice();
            double discount = foods[i].getDiscount();
            sum = itemTotal - (itemTotal * discount / 100);
        }
        return sum;
    }

    public double getVegetarianTotal(){
        double sum = 0;
        for (int i=0; i < foods.length; i++){
            if (foods[i].isVegetarian()){
                sum = sum + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return sum;
    }

}
