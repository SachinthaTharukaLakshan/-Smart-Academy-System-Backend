package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.dto.Teacher;
import edu.icet.service.CustomerService;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/teacher")
@CrossOrigin
@RequiredArgsConstructor
public class TeacherController {
    @Autowired
    final TeacherService service;

    @GetMapping("/get-all")
    public List<Teacher> getTeacher() {
        return service.getAll();
    }

    @PostMapping("/add-teacher")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTeacher(@RequestBody Teacher teacher) {
        service.addTeacher(teacher);
    }

    @GetMapping("/search-by-id/{id}")
    public Teacher getTeacherById(@PathVariable Integer id) {
        return service.searchTeacherById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteTeacherById(@PathVariable Integer id) {
        service.deleteTeacherById(id);
    }

    @PutMapping("/update-teacher")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateTeacher(@RequestBody Teacher teacher) {
        service.updateTeacherById(teacher);
    }
}
