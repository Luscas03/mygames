package dal;
//importa a classe de manipulação de SQL

import java.sql.*;

public class ConectorModule {
//Conexão com Mysql

    public static Connection conect() {
        //variavel de conexão
        java.sql.Connection conn = null;
        //Driver de conexão
        String driver = "com.mysql.jdbc.Driver";
        //Nome do banco de dados
        String url = "jdbc:mysql://localhost:3306/mygames";
        //Usuário e Senha do Mysql
        String user = "root";
        String passwd = "";
        //Conexão com mysql
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, passwd);
            return conn;
        } catch (Exception e) {
//testes            
//System.out.println(e);
            return null;
        }

    }

}
