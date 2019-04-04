package io.github.statut.docker.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@WebServlet(urlPatterns = "/hi", loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet {
    private static final String URL = "jdbc:postgresql://db/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Properties props = new Properties();
        props.setProperty("user", USER);
        props.setProperty("password", PASSWORD);
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(URL, props);
            response.getWriter().print("Database version: " + conn.getMetaData().getDatabaseProductVersion());
        } catch (SQLException | ClassNotFoundException e) {
            response.getWriter().print("Error: " + e.getMessage());
        }

    }

}
