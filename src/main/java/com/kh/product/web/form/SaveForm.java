package com.kh.product.web.form;


import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SaveForm {

  @NotEmpty //null,빈문자열(""),공백문자(" ") 허용안함
  @Size(min=1,max=15)
  private String pname;

  @NotEmpty
  @Positive
  @Max(9999)
  private Long quantity;


  @NotEmpty
  @Positive //양수
  @Min(1000) //최소값
  //수량*가격 1억?
  private Long price;
}
