package vote.db.core;

import static vote.core.VoteApplicationContext.getBean;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataAccessObject<T> {

	private final JdbcTemplate jdbcTemplate;

	protected DataAccessObject(final String dsName) {
		DataSource dataSource = getBean(dsName, DataSource.class);
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public T read(final long id) {
//		jdbcTemplate.query(sql, rowMapper, args)

		return null;
	}
}
