package edu.icet.service;

import edu.icet.dto.Customer;
import edu.icet.dto.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAll();
    void addTeacher(Teacher teacher);
    void deleteTeacherById(Integer id);
    Teacher searchTeacherById(Integer id);
    void updateTeacherById(Teacher teacher);
}
