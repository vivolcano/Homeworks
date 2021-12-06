package com.example.homework28.repositories;

import com.example.homework28.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ProductRepositoryJdbcTemplate implements ProductRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepositoryJdbcTemplate(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Product> productRowMapper = (rs, rowNum) -> {
        int id = rs.getInt("id");
        String title = rs.getString("title");
        double price = rs.getDouble("price");
        int number = rs.getInt("number");

        return new Product(id, title, price, number);
    };

    @Override
    public List<Product> findAll() {

        return jdbcTemplate.query(
                "select * " +
                    "from product order by id", productRowMapper);
    }


    @Override
    public List<Product> findAllByPrice(double price) {

        return jdbcTemplate.query(
                    "select *" +
                        "from product " +
                        "where price = ? " +
                        "order by id"
                    ,productRowMapper
                    ,price);
    }

    @Override
    public List<Product> findAllByOrdersCount(int ordersCount) {

        return jdbcTemplate.query(
                    "select * " +
                        "from product " +
                        "where (select count (*) from orders where product_id = product.id) = ? " +
                        "order by id"
                    ,productRowMapper
                    ,ordersCount);
    }

    @Override
    public void save(Product product) {
        jdbcTemplate.update(
                "insert into product(title, price, number) values(?, ?, ?)"
                    ,product.getTitle()
                    ,product.getPrice()
                    ,product.getNumber());
    }
}
