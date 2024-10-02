package com.util;

// DB를 연결하기 위한 클래스
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
    // DB 연결자를 담을 수 있는 변수
    private static Connection dbConn;

    // 메서드
    public static Connection getConnection() {
        // 연결할 때 try-catch는 반드시 써야 함.
        if (dbConn == null) {
            try {
                // MySQL JDBC URL (포트는 기본적으로 3306)
                String url = "jdbc:mysql://localhost:3306/my_database"; // DB 이름에 맞게 수정
                String user = "vagrant"; // MySQL 사용자 이름
                String pwd = "vagrant"; // MySQL 비밀번호

                // MySQL JDBC 드라이버 로드
                Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL Connector/J 드라이버 클래스

                // DriverManager를 통해 지정한 URL, 사용자 이름, 비밀번호로 연결
                dbConn = DriverManager.getConnection(url, user, pwd);

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        return dbConn; // DB 연결자 반환
    }

    // DB를 사용한 후 종료하는 메서드
    public static void close() {
        if (dbConn != null) { // null이 아니면 연결되어 있는 상태
            try {
                if (!dbConn.isClosed()) { // dbConn이 닫혀있지 않으면
                    dbConn.close(); // 닫아줘라
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        dbConn = null; // 연결 종료 후 초기화
    }
}
