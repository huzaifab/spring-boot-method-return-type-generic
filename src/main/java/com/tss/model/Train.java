package com.tss.model;
/**
 * @author huzaifa bhavnagri
 */
import lombok.AllArgsConstructor;
import lombok.Getter;

//@Data
@AllArgsConstructor
public class Train<T> {
  
  @Getter
  private String name;
  @Getter
  private int cars;
  @Getter
  private int seats;
  
}