package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<String,Item>();
    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Avengers Endgame");
        movie.setPrice(999.00);
        movie.setRuntime("3 hours 15 minutes");
        items.put("Movie",movie);

        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(399.00);
        book.setTitle("Aladin");
        items.put("Book",book);
    }
}
