package br.com.rmoreira.todolisty.repository;

import br.com.rmoreira.todolisty.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
