package my.core;

import my.spring.jdbc.Customer;
import org.h2.jdbc.JdbcSQLException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Max Titov 3/28/14 1:54 PM
 */
public class DataSource {

    private static final String PASSWORD = "";
    private static final String URL = "jdbc:h2:mem";
    private static final String USERNAME = "sa";
    private static JdbcTemplate jdbcTemplate;

    static {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUsername(USERNAME);
        dataSource.setUrl(URL);
        dataSource.setPassword(PASSWORD);
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public static String get(String table) {
        jdbcTemplate.setMaxRows(1);
        try {
            List<String> results = jdbcTemplate.query("select content, time from " + table + " order by id desc", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getString("content") + " generated at " + rs.getString("time");
                }
            });
            if (!results.isEmpty()) {
                return results.get(0);
            }
        } catch (BadSqlGrammarException e) {
            jdbcTemplate.execute("create table if not exists " + table + "(id serial, content varchar(16), time timestamp)");
            get(table);
        }
        return "";
    }

    public static void persist(String content, String table) {
        if (table.isEmpty()) {
            table = "common";
        }
        jdbcTemplate.update("INSERT INTO " + table + " (content, time) values(?, ?)", content, new Date());
    }

}
