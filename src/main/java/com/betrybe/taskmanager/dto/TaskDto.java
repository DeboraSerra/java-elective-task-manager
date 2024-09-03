package com.betrybe.taskmanager.dto;

import com.betrybe.taskmanager.model.TaskModel;

/**
 * The type Task dto.
 */
public record TaskDto(String id,
                      String title,
                      String description,
                      String ownerName,
                      Boolean isComplete) {

  /**
   * From entity task dto.
   *
   * @param task the task
   * @return the task dto
   */
  public static TaskDto fromEntity(TaskModel task) {
    return new TaskDto(
        task.getId(),
        task.getTitle(),
        task.getDescription(),
        task.getOwnerName(),
        task.getIsCompleted()
    );
  }
}
