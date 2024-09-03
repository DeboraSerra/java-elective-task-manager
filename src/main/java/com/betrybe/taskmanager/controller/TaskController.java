package com.betrybe.taskmanager.controller;

import com.betrybe.taskmanager.database.FakeTaskDatabase;
import com.betrybe.taskmanager.dto.TaskCreationDto;
import com.betrybe.taskmanager.dto.TaskDto;
import com.betrybe.taskmanager.exception.NotFound;
import com.betrybe.taskmanager.model.TaskModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Task controller.
 */
@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

  private final FakeTaskDatabase database;

  /**
   * Instantiates a new Task controller.
   *
   * @param database the database
   */
  @Autowired
  public TaskController(FakeTaskDatabase database) {
    this.database = database;
  }

  /**
   * Gets all tasks.
   *
   * @return the all tasks
   */
  @GetMapping
  public ResponseEntity<List<TaskDto>> getAllTasks() {
    List<TaskModel> tasks = database.getAllTasks();
    List<TaskDto> taskDtos = tasks.stream().map(TaskDto::fromEntity).toList();
    return ResponseEntity.status(HttpStatus.OK).body(taskDtos);
  }

  /**
   * Gets by id.
   *
   * @param id the id
   * @return the by id
   * @throws NotFound the not found
   */
  @GetMapping("/{id}")
  public ResponseEntity<TaskDto> getById(@PathVariable String id) throws NotFound {
    TaskModel task = database.getTaskById(id);
    if (task == null) {
      throw new NotFound("Atividade não encontrada!");
    }
    return ResponseEntity.status(HttpStatus.OK).body(TaskDto.fromEntity(task));
  }

  /**
   * Create task response entity.
   *
   * @param body the body
   * @return the response entity
   */
  @PostMapping
  public ResponseEntity<String> createTask(@RequestBody TaskCreationDto body) {
    TaskModel task = database.createTask(body.title(), body.description(), body.ownerName());
    return ResponseEntity.status(HttpStatus.CREATED).body(task.getId());
  }

  /**
   * Update task response entity.
   *
   * @param id the id
   * @return the response entity
   * @throws NotFound the not found
   */
  @PutMapping("/{id}")
  public ResponseEntity<TaskDto> updateTask(@PathVariable String id) throws NotFound {
    TaskModel task = database.setTaskAsCompleted(id);
    if (task == null) {
      throw new NotFound("Tarefa não encontrada");
    }
    task.setIsCompleted(true);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(TaskDto.fromEntity(task));
  }

  /**
   * Delete task response entity.
   *
   * @param id the id
   * @return the response entity
   * @throws NotFound the not found
   */
  @DeleteMapping("/{id}")
  public ResponseEntity<TaskDto> deleteTask(@PathVariable String id) throws NotFound {
    TaskModel task = database.removeTaskById(id);
    if (task == null) {
      throw new NotFound("Tarefa não encontrada");
    }
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body(TaskDto.fromEntity(task));
  }
}
