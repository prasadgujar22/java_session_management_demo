package com.example.onboarding.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionManager {
    private ConnectionManager() {
    }

    public static Connection getConnection(DatabaseConfig config) throws SQLException {
        return DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
    }
}
