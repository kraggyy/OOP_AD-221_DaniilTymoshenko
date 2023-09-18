package laba2;

/*import java.util.LinkedList;*/

class Item {
    private String name;
    private float price;

    public Item(String name, float price) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }
    public void increasePrice(float percent) {
        if (percent > 0) {
            price += price * (percent / 100);
        }
    }

    public void decreasePrice(float percent) {
        if (percent > 0) {
            price -= price * (percent / 100);
            if (price < 0) {
                price = 0;
            }
        }
    }

    public float getPrice() {
        return price;
    }
}

class Cart {
    private Item[] stack;
    private int top;
    private int maxSize;

    public Cart(int maxSize) {
        this.maxSize = maxSize;
        stack = new Item[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(Item item) {
        if (!isFull()) {
            stack[++top] = item;
        } else {
            System.out.println("Кошик переповнений!");
        }
    }

    public Item pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Кошик порожній!");
            return null;
        }
    }

    public float calculateTotalPrice() {
        float total = 0;
        for (int i = 0; i <= top; i++) {
            total += stack[i].getPrice();
        }
        return total;
    }

    public void increasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].increasePrice(percent);
        }
    }

    public void decreasePrices(float percent) {
        for (int i = 0; i <= top; i++) {
            stack[i].decreasePrice(percent);
        }
    }
}


/* class Cart {
    private LinkedList<Item> queue;
    private int maxSize;

    public Cart(int maxSize) {
        this.maxSize = maxSize;
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.size() >= maxSize;
    }

    public void push(Item item) {
        if (!isFull()) {
            queue.addLast(item);
        } else {
            System.out.println("Кошик переповнений!");
        }
    }

    public Item pop() {
        if (!isEmpty()) {
            return queue.poll();
        } else {
            System.out.println("Кошик порожній!");
            return null;
        }
    }

    public float calculateTotalPrice() {
        float total = 0;
        for (Item item : queue) {
            total += item.getPrice();
        }
        return total;
    }

    public void increasePrices(float percent) {
        for (Item item : queue) {
            item.increasePrice(percent);
        }
    }

    public void decreasePrices(float percent) {
        for (Item item : queue) {
            item.decreasePrice(percent);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(10);

        // Додаємо товари до кошика
        cart.push(new Item("Товар 1", 100));
        cart.push(new Item("Товар 2", 150));
        cart.push(new Item("Товар 3", 200));
        cart.push(new Item("Товар 4", 50));
        cart.push(new Item("Товар 5", 300));

        // Виводимо суму цін товарів у кошику
        float totalPrice = cart.calculateTotalPrice();
        System.out.println("Сума цін товарів у кошику: " + totalPrice);

        // Піднімаємо ціни в кошику на 15%
        cart.increasePrices(15);
        float increasedTotalPrice = cart.calculateTotalPrice();
        System.out.println("Змінена сума цін після підняття на 15%: " + increasedTotalPrice);

        // Знижуємо ціни в кошику на 30%
        cart.decreasePrices(30);
        float decreasedTotalPrice = cart.calculateTotalPrice();
        System.out.println("Змінена сума цін після зниження на 30%: " + decreasedTotalPrice);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(10);

        // Додаємо товари до кошика
        cart.push(new Item("Товар 1", 100));
        cart.push(new Item("Товар 2", 150));
        cart.push(new Item("Товар 3", 200));
        cart.push(new Item("Товар 4", 50));
        cart.push(new Item("Товар 5", 300));

        // Виводимо суму цін товарів у кошику
        float totalPrice = cart.calculateTotalPrice();
        System.out.println("Сума цін товарів у кошику: " + totalPrice);

        // Піднімаємо ціни в кошику на 15%
        cart.increasePrices(15);
        float increasedTotalPrice = cart.calculateTotalPrice();
        System.out.println("Змінена сума цін після підняття на 15%: " + increasedTotalPrice);

        // Знижуємо ціни в кошику на 30%
        cart.decreasePrices(30);
        float decreasedTotalPrice = cart.calculateTotalPrice();
        System.out.println("Змінена сума цін після зниження на 30%: " + decreasedTotalPrice);
    }
}