package com.anubhav.pojo;

import com.anubhav.proto.Student;

import java.util.List;

public class StudentClassPojo {
    private List<StudentPojo> students;

    public List<StudentPojo> getStudents() {
        return students;
    }

    public void setStudents(List<StudentPojo> students) {
        this.students = students;
    }
}
