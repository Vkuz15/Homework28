package ru.hogwarts.school.services;

import ru.hogwarts.school.model.Student;

import java.util.*;

public interface StudentService extends GeneralService<Student> {

    List<Student> getAllStudentsAge(int age);
}
