package com.task.taskmanager.domain.repository;

import com.task.taskmanager.persistence.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
