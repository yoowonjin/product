package com.kh.product.web.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateForm {
  private Long pid;


  @NotEmpty
  private String pname;

  @NotEmpty
  @Positive
  private Long quantity;

  @NotEmpty
  @Positive
  private Long price;
}
