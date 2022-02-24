package net.javaguides.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.sms.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
