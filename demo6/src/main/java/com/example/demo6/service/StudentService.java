package com.example.demo6.service;

import com.example.demo6.Dao.StudentDao;
import com.example.demo6.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void addStudent(StudentDto studentDto) {
        studentDao.save(studentDto);
    }
}
