import java.util.Random;

public class MagicBox<T> {

    private int count;
    private T[] items;

    public MagicBox(int count) {
        this.count = count;
        items = (T[]) new Object[count];
    }


    protected boolean add(T item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    protected T pick() {
        int j = items.length;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                j--;
            }
        }
        if (j < items.length && j != 0) {
            throw new RuntimeException("Коробка не полна, осталось заполнить " + j + " элементов");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(count);
            return items[randomInt];
        }
    }
}
