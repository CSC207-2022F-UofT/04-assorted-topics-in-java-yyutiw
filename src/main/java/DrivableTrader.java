import java.util.List;

public class DrivableTrader extends Trader<Drivable> {
    public DrivableTrader(int money) {
        super(money);
    }
    public DrivableTrader (List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }
    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable) {
            return ((Tradable) item).getPrice() + item.getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }
}