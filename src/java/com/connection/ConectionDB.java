/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConectionDB {

    /**
     * The method connect() handle the connection in the database, validating the database that we use, the user and the password to
     * login.
     * @return return a object of DriverManagerDataSource that specify the info to connect to the database
     **/
    public DriverManagerDataSource connect() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/dbworker");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        return dataSource;
    }

}
