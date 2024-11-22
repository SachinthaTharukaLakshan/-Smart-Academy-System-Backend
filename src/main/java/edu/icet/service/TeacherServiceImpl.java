package edu.icet.service;

import edu.icet.dto.Customer;
import edu.icet.dto.Teacher;
import edu.icet.entity.CustomerEntity;
import edu.icet.entity.TeacherEntity;
import edu.icet.repositoruy.CustomerRepository;
import edu.icet.repositoruy.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor

public class TeacherServiceImpl implements TeacherService{
    private final TeacherRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teacherArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            teacherArrayList.add(mapper.map(entity, Teacher.class));
        });
        return teacherArrayList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        repository.save(mapper.map(teacher, TeacherEntity.class));
    }

    @Override
    public void deleteTeacherById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Teacher searchTeacherById(Integer id) {
        return mapper.map(repository.findById(id), Teacher.class);
    }

    @Override
    public void updateTeacherById(Teacher teacher) {
        repository.save(mapper.map(teacher,TeacherEntity.class));
    }
}
