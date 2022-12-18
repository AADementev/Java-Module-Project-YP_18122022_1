public class Product { // создаем класс и конструктор для продуктов
    // Объявляем поля, но не присваиваем им значения
    String name;  // Название продукта
    double price;      // Цена продукта
    // Конструктор принимает 2 параметра
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
