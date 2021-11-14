import com.epam.brest.dao.DishDao;
import com.epam.brest.model.Dish;
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

public class DishDaoJDBCImpl implements DishDao {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String SQL_ALL_DISHES = "select d.dish_id, d.dish_name from dish d order by d.dish_name";
    private final String SQL_CREATE_DISH = "insert into dish(dish_name) values(:dishName)";

    public DishDaoJDBCImpl(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<Dish> findAll() {
        return namedParameterJdbcTemplate.query(SQL_ALL_DISHES, new DishRowMapper());
    }

    @Override
    public Integer create(Dish dish) {

        //TODO: isDepartmentUnique throw new IllegalArgumentException

        SqlParameterSource sqlParameterSource =
                new MapSqlParameterSource("dishName", dish.getDishName().toUpperCase());
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(SQL_CREATE_DISH, sqlParameterSource, keyHolder);
        return (Integer) keyHolder.getKey();
    }

    @Override
    public Integer update(Dish dish) {
        return null;
    }

    @Override
    public Integer delete(Integer dish_id) {
        return null;
    }

    private class DishRowMapper implements RowMapper<Dish> {
        @Override
        public Dish mapRow(ResultSet resultSet, int i) throws SQLException {
            Dish dish = new Dish();
            dish.setDishId(resultSet.getInt("dish_id"));
            dish.setDishName(resultSet.getString("dish_name"));
            return dish;
        }
    }
}
