package homeworks.homework25;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

/*
Реализовать ProductsRepository

- List<Product> findAll();

- List<Product> findAllByPrice(double price);

* List<Product> findAllByOrdersCount(int ordersCount);
- найти все товары по количеству заказов, в которых участвуют

 */

public class Main {
    public static final DataSource dataSource = new DriverManagerDataSource(
            "jdbc:postgresql://localhost:5433/hw_24", "postgres", "0000");

    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepositoryJdbcTemplateImpl(dataSource);

        productRepository.findAll().forEach(System.out::println);
        productRepository.findAllByPrice(99).forEach(System.out::println);
        productRepository.findAllByOrdersCount(2).forEach(System.out::println);

        Product sofa = Product.builder()
                .title("Диван")
                .price(9900)
                .number(10)
                .build();

        productRepository.save(sofa);

    }
}
