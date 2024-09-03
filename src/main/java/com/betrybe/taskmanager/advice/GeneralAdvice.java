package com.betrybe.taskmanager.advice;

import com.betrybe.taskmanager.exception.NotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * The type General advice.
 */
@ControllerAdvice
public class GeneralAdvice {

  /**
   * Handle not found response entity.
   *
   * @param exception the exception
   * @return the response entity
   */
  @ExceptionHandler
  public ResponseEntity<String> handleNotFound(NotFound exception) {
    return ResponseEntity.status(404).body(exception.getMessage());
  }
}
