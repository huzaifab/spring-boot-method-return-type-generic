package com.tss.model;
/**
 * @author huzaifa bhavnagri
 */
import lombok.Getter;

public class DataResponse<T> {
  @Getter
  private final T data;
  public DataResponse(T data) {
   this.data = data;
  }
}
