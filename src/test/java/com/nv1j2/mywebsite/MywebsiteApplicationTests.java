package com.nv1j2.mywebsite;

import com.nv1j2.mywebsite.controller.test1.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;
import java.util.Arrays;
import java.util.stream.IntStream;

@SpringBootTest
class MywebsiteApplicationTests {

    @Test
    void contextLoads() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\app\\work\\ideaWorkspace\\mywebsite\\db\\sqlite.db");
            Statement stmt = conn.createStatement();
//             int i = stmt.executeUpdate("create table tbl1(name varchar(20), salary int);");
//             int i1 = stmt.executeUpdate("insert into tbl1 values('ZhangSan',8000);");
            ResultSet rs = stmt.executeQuery("select * from tbl1");
            while (rs.next()) {
                String id = rs.getString(1);
                String code = rs.getString(2);
                System.out.println("用户名:" + id + "， 数值:" + code);
            }
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Autowired
    Person person;

    @Test
    void test1() {
        System.out.println(person);
    }

    @Test
    void test2() {
        String aa = """
                  .   ____          _            __ _ _
                 /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\
                ( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\
                 \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
                  '  |____| .__|_| |_|_| |_\\__, | / / / /
                 =========|_|==============|___/=/_/_/_/
                 :: Spring Boot ::        (v2.2.4.RELEASE)
                """;

        System.out.println(aa);
    }

    @Test
    void test3() {
        final int MAX = 500;

        int x1 = -500;
        int x2 = -500;
        int y1 = -500;
        int y2 = -500;


        IntStream.range(x1, MAX).forEach(i1 -> {
            IntStream.range(x2, MAX).forEach(i2 -> {
                IntStream.range(y1, MAX).forEach(i3 -> {
                    IntStream.range(y1, MAX).forEach(i4 -> {

                        if (i1 + i2 == 80 && i1 + i3 == 130 && i3 - i4 == 60 && i2 + i4 == 80) {
                            System.out.println(i1/10.0 + "+" + i2/10.0 + "= 8");
                            System.out.println(i1/10.0 + "+" + i3/10.0 + "= 13");
                            System.out.println(i3/10.0 + "-" + i4/10.0 + "= 6");
                            System.out.println(i2/10.0 + "+" + i4/10.0 + "= 8");
                        }
                    });
                });
            });
        });


    }

}
