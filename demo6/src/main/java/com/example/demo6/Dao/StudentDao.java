package com.example.demo6.Dao;

import com.example.demo6.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(StudentDto student) {
        String sql = "INSERT INTO students (id, first_name, last_name, age, address) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, student.getId(), student.getFirstName(), student.getLastName(), student.getAge(), student.getAddress());
    }
}
