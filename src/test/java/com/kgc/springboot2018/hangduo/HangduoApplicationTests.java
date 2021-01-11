package com.kgc.springboot2018.hangduo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class HangduoApplicationTests {
	@Resource
	DataSource dataSource;
	@Test
	void contextLoads1() {
		System.out.println(dataSource.getClass());
		try {
			Connection connection = dataSource.getConnection();
			System.out.println(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
