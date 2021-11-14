package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
public class mysqltest {
   @Autowired
   private DataSource dataSource;
   @Test
    public void testConnetion() throws Exception{
      Connection conn =dataSource.getConnection();
      System.out
               .println(conn);
   }
}
