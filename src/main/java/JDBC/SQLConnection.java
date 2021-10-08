package JDBC;

import java.sql.*;
import javax.sql.*;

public class SQLConnection {

    DatabaseType databaseType;
    String hostname;
    String user;
    String password;
    Integer port;


    SQLConnection(DatabaseType databaseType, String hostname, String user, String password, Integer port) {
        this.databaseType = databaseType;
        this.hostname = hostname;
        this.user = user;
        this.password = password;
        this.port = port;
    }


}
