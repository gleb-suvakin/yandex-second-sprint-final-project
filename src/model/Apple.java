package model;

import model.constans.Colour;
import model.constans.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour){
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour(){
        return colour;
    }

    @Override
    public double getDiscount(){
        if(colour == "red"){
            return Discount.RED_APPLES_DISCOUNT;
        }
        return 0;
    }
}
