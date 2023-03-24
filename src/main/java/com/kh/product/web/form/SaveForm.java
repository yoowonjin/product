package com.kh.product.web.form;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveForm {

  @NotBlank
  @Size(min=2,max=10)
  private String pname;

  @NotNull
  @Positive
  @Max(9999)
  private Long quantity;


  @NotNull
  @Positive //양수
  @Min(10) //최소값
  //수량*가격 1억?
  private Long price;
}
