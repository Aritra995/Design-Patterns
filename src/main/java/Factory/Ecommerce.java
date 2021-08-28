package Factory;

public class Ecommerce extends Website{
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemsPage());
        pages.add(new PaymentsPage());
    }
}
