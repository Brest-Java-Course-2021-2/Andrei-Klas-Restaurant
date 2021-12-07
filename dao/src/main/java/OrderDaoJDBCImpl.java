import com.epam.brest.dao.OrderDao;
import com.epam.brest.model.Order;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OrderDaoJDBCImpl implements OrderDao {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String SQL_ALL_ORDERS = "SELECT o.order_id, o.order_name FROM order o ORDER BY o.order_name";
    private final String SQL_CREATE_ORDER = "insert into order(order_name) values(:orderName)";

    public OrderDaoJDBCImpl(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Order> findAll() {
        return namedParameterJdbcTemplate.query(SQL_ALL_ORDERS, new OrderRowMapper());
    }

    @Override
    public Integer create(Order order) {

        //TODO: isDepartmentUnique throw new IllegalArgumentException

        SqlParameterSource sqlParameterSource =
                new MapSqlParameterSource("orderName", order.getOrderName().toUpperCase());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(SQL_CREATE_ORDER, sqlParameterSource, keyHolder);
        return (Integer) keyHolder.getKey();
    }

    @Override
    public Integer update(Order order) {
        return null;
    }

    @Override
    public Integer delete(Integer dish_id) {
        return null;
    }

    private class OrderRowMapper implements RowMapper<Order> {
        @Override
        public Order mapRow(ResultSet resultSet, int i) throws SQLException {
            Order order = new Order();
            order.setOrderID(resultSet.getInt("order_id"));
            order.setOrderName(resultSet.getString("order_name"));
            return order;
        }
    }
}
