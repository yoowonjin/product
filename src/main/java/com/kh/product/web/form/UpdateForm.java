package com.kh.product.web.form;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateForm {
  private Long pid;


  @NotBlank
  private String pname;

  @NotNull
  private Long quantity;

  @NotNull
  @Min(1000) //최소값
  private Long price;
}
