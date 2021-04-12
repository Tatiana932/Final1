/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.connection.ConectionDB;
import com.models.Client;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


public class CliDao {

    JdbcTemplate jdbcTemplate;
    ConectionDB con = new ConectionDB();

    public CliDao() {
        this.jdbcTemplate = new JdbcTemplate(con.connect());
    }

    /**
     * This method shows a list of teachers registred.
     **/
    public List viewAllTeacher() {
        List teachers = new ArrayList();
        String sql = "select * from tbteacher";
        teachers = this.jdbcTemplate.queryForList(sql);
        return teachers;
    }

    /**
     * This method allows add a teacher in the db
     * @param newTeacher a object with the info.
     * @return a int value
     **/
    public int addTeacher(Client newTeacher) {
        String sql = "INSERT INTO TBTEACHER (TH_NAME, TH_LASTNAME, TH_MAIL, TH_PHONE, TH_SUBJECT) "
                + " VALUES (?,?,?,?,?)";
        int validation = this.jdbcTemplate.update(sql, newTeacher.getTh_name(), newTeacher.getTh_lastname(),
                newTeacher.getTh_mail(), newTeacher.getTh_phone(), newTeacher.getTh_subject());
        return validation;
    }

    /**
     * This method allows update info.
     * @param teacher_id recives the id to update
     * @return a client object
     **/
    public Client updateTeacherGet(int teacher_id) {
       final Client teacher = new Client();
        String sql = "select * from tbteacher where th_id = " + teacher_id;

        return (Client) this.jdbcTemplate.query(sql, new ResultSetExtractor<Client>() {
            public Client extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    teacher.setTh_id(rs.getInt("th_id"));
                    teacher.setTh_name(rs.getString("th_name"));
                    teacher.setTh_lastname(rs.getString("th_lastname"));
                    teacher.setTh_mail(rs.getString("th_mail"));
                    teacher.setTh_phone(rs.getString("th_phone"));
                    teacher.setTh_subject(rs.getString("th_subject"));
                }
                return teacher;
            }

        }
        );
    }

    /**
     * This method send the new data to update a user.
     * @param teacher the new info to update.
     * @return a int
     **/
    public int updateTeacherPost(Client teacher) {
        String sql = "update tbteacher set th_name = '" + teacher.getTh_name() + "', th_lastname = '" + teacher.getTh_lastname() + "'"
                + ", th_mail = '" + teacher.getTh_mail() + "', th_phone = '" + teacher.getTh_phone() + "', th_subject= '" + teacher.getTh_subject() + "'"
                + "where th_id = " + teacher.getTh_id();

        return this.jdbcTemplate.update(sql);
    }

    /**
     * This method allows delete a user
     * @param teacher_id search a teacher through the id
     * @return a int 
     **/
    public int deleteTeacher(int teacher_id) {

        String sql = "delete from tbteacher where th_id = " + teacher_id;
        int validate = this.jdbcTemplate.update(sql);

        return validate;

    }

}
