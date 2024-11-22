package edu.icet.repositoruy;

import edu.icet.entity.CustomerEntity;
import edu.icet.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer> {
}
