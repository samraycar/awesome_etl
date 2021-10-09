package JDBC;

import java.sql.*;
import javax.sql.*;

public class SQLConnection {

    DatabaseType databaseType;
    String hostname;
    String user;
    String password;
    Integer port;
    String schema;


    SQLConnection(DatabaseType databaseType, String hostname, String user, String password, Integer port) {
        this.databaseType = databaseType;
        this.hostname = hostname;
        this.user = user;
        this.password = password;
        this.port = port;
    }

    public void useSchema(String schema) {
        this.schema = schema;
    }




}
