package net.javaguides.sms.services;

import java.util.List;

import net.javaguides.sms.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
