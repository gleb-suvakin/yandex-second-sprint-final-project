import model.Apple;
import model.Food;
import model.Meat;
import model.constans.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] foods = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(foods);
        System.out.println("Итоговая стоймость без скидок: " + cart.getTotalWithoutDiscount());
        System.out.println("Итоговая стоймость с учетом скидок: " + cart.getTotalWithDiscount());
        System.out.println("Итоговая стоймость вегетарианских продуктов: " + cart.getVegetarianTotal());
    }
}