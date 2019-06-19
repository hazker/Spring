package hello;

import java.sql.*;
import java.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.ResultSet;
import java.sql.Statement;


class GetUser{

    private final long id;
    private final String content;


    public GetUser(long id, String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
