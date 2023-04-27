/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifp.centrodefauna;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Arturo
 */
public class Connection {
    // Proporties
    private String hostname;
    private String port;
    private String username;
    private String password;
    private String database;

    private java.sql.Connection connection;

    // Constructors

    /**
     * Establece una conexión con valores predeterminados
     */
    public Connection() {
        this.hostname = "localhost";
        this.port = "3307";
        this.username = "";
        this.password = "";
        this.database = "test";
    }

    /**
     *  Establece por determinado al localhost con puerto 3307 
     * cambiando el usuario, contraseña y nombre de la base de datos
     * @param username tu usuario
     * @param password tu contraseña
     * @param database nombre de la base de datos
     */
    public Connection(String username, String password, String database) {
        this.hostname = "localhost";
        this.port = "3307";
        this.username = username;
        this.password = password;
        this.database = database;
    }

    /**
     * Establece por determinado con el puerto 3307 
     * cambiando el hostname, el usuario, la contraseña y el nombre de la base de datos
     * @param hostname 
     * @param username
     * @param password
     * @param database
     */
    public Connection(String hostname, String username, String password, String database) {
        this.hostname = hostname;
        this.port = "3307";
        this.username = username;
        this.password = password;
        this.database = database;
    }

    /**
     * 
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @param database
     */
    public Connection(String hostname, String port, String username, String password, String database) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.database = database;
    }

    // Functions

    /**
     *  
     */
    public void connect() {        
        String url = "jdbc:mysql://" + this.hostname + ":" + this.port + "/" + this.database;
        try {
            this.connection = DriverManager.getConnection(url, this.username, this.password);
        } catch (SQLException ex) {
            this.connection = null;
        }
    }

    /**
     * desconecta la tabla, en caso de estar desconectada iguala la conexión a null
     */
    public void disconnect() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            this.connection = null;
        }
        this.connection = null;
    }
    
    /**
     * 
     * @param query
     * @throws SQLException
     */
    public void createTable(String query) throws SQLException {
        if (!this.isConnected()) {
            this.connect();
        }
        
        Statement sm = this.connection.createStatement();
        
        sm.executeUpdate(query);
    }

    /**
     *
     * @param query
     * @param values
     * @return
     * @throws SQLException
     */
    public ResultSet preparedStatement(String query, ArrayList<Object> values) throws SQLException {
        if (!this.isConnected()) {
            this.connect();
        }

        PreparedStatement ps = this.connection.prepareStatement(query);
        for (int i = 1; i <= values.size(); i++) {
            ps.setObject(i, values.get(i - 1));
        }
        ps.execute();

        return ps.getResultSet();
    }

    /**
     *  Realiza Selects devolviendo es resultado de la busqueda
     * @param query que pregunta a la base de datos
     * @return devuelte el resultset de la consulta
     * @throws SQLException
     */
    public ResultSet query(String query) throws SQLException {
        if (!this.isConnected()) {
            this.connect();
        }

        Statement sm = this.connection.createStatement();
        
        return sm.executeQuery(query);
    }

    /**
     *  El ResultSet será desplazable y modificables
     * @param query pregunta a la base de datos
     * @return devuelte el resultset de la consulta
     * @throws SQLException
     */
    public ResultSet queryRsIsModificable(String query) throws SQLException {
        if (!this.isConnected()) {
            this.connect();
        }

        Statement sm = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        return sm.executeQuery(query);
    }
    
    /**
     * Realiza las funciones Insert, Update y Delete de sql 
     * @param query para realizar
     * @return devuelve el numero de filas que han sido modificadas
     * @throws SQLException
     */
    public int updateQuery(String query) throws SQLException {
        if (this.isConnected()) {
            this.connect();
        }

        Statement sm = this.connection.createStatement();
        return sm.executeUpdate(query);
    }

    // Getters and setters

    /**
     *
     * @return
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     *
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     *
     * @return
     */
    public String getPort() {
        return this.port;
    }

    /**
     *
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return this.username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     *
     * @param database
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     *
     * @return
     */
    public java.sql.Connection getConnection() {
        return this.connection;
    }

    /**
     * 
     * @return Devuelve verdadero si está conectada la base de datos
     */
    public boolean isConnected() {
        try {
            return this.connection != null && !this.connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}