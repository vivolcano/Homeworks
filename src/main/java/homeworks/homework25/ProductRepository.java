package homeworks.homework25;

import java.util.List;

public interface ProductRepository {

List<Product> findAll();
List<Product> findAllByPrice(double price);
List<Product> findAllByOrdersCount(int ordersCount);

}
