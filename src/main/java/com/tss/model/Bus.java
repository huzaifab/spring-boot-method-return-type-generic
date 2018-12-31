package com.tss.model;
/**
 * @author huzaifa bhavnagri
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bus<T> {
  private String name;
  private int busNum;
  private int seats;
  private String color;
}