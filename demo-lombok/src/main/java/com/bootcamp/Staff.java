package com.bootcamp;

import javax.annotation.processing.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
  private String name;
  private String hkid;
  private String email;

  public static void main(String[] args) {
    Staff s1 = Staff.builder()
      .name("John")
      .hkid("H123545")
      .email("john@gmail.com")
        .build();

        System.out.println(s1.getName());
  }
}
