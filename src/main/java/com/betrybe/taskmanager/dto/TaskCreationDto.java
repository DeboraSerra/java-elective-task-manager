package com.betrybe.taskmanager.dto;

import com.betrybe.taskmanager.model.TaskModel;

/**
 * The type Task creation dto.
 */
public record TaskCreationDto(
                              String title,
                              String description,
                              String ownerName) {

  /**
   * To entity task model.
   *
   * @return the task model
   */
  public TaskModel toEntity() {
    return new TaskModel(title, description, ownerName);
  }
}
