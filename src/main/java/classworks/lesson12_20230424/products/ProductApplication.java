package classworks.lesson12_20230424.products;
/*
Задача: Управление каталогом продуктов
        Требуется создать систему управления каталогом продуктов в интернет-магазине с использованием коллекции  Java.
        Каталог должен позволять добавлять, удалять и искать продукты по их уникальному идентификатору.
*/

public class ProductApplication {
  public static void main(String[] args) {
    ProductManager manager = new ProductManager();

    Product product1 = new Product("Wecker", 12.33);
    Product product2 = new Product("Schokolade", 2.3);
    Product product3 = new Product("Milch", 3.12);
    Product product4 = new Product("Eier", 2.46);
    Product product5 = new Product("Brot", 2.76);

    manager.addProduct(1, product1);
    manager.addProduct(2, product2);
    manager.addProduct(3, product3);
    manager.addProduct(4, product4);
    manager.addProduct(5, product5);

    manager.getCatalog();

    manager.deleteProduct(4);
    manager.getCatalog();
    manager.deleteProduct(4);
    manager.getCatalog();

    System.out.println(manager.findProduct(5));
    System.out.println(manager.findProduct(4));
  }
}
