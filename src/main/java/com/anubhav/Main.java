package com.anubhav;

import com.anubhav.pojo.StudentClassPojo;
import com.anubhav.pojo.StudentPojo;
import com.anubhav.proto.Student;
import com.anubhav.proto.StudentsClass;
import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        // proto based
        com.anubhav.proto.Student student = com.anubhav.proto.Student.newBuilder()
                .setAge(10)
                .setName("Anubhav")
                .build();

        StudentsClass studentsClass =  StudentsClass.newBuilder().
                addStudents(student).
                addStudents(student).build();

        byte[] array = studentsClass.toByteArray();
        for(int x =0 ; x< student.toByteArray().length;x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();
        StudentsClass parsedStudent = StudentsClass.parseFrom(array);
        System.out.println(parsedStudent.getStudents(0).getAge());
        System.out.println(parsedStudent.getStudents(0).getName());

        System.out.println("***********");
        //json based
        StudentPojo studentPojo =  new StudentPojo();
        studentPojo.setAge(10);
        studentPojo.setName("Anubhav");
        StudentClassPojo studentClassPojo = new StudentClassPojo();
        List<StudentPojo> studentPojos = new ArrayList<>();
        studentPojos.add(studentPojo);
        studentPojos.add(studentPojo);

        studentClassPojo.setStudents(studentPojos);

        System.out.println(new Gson().toJson(studentClassPojo));
        System.out.println(new Gson().toJson(studentClassPojo).length());

    }
}