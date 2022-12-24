package com.example.clinc.inputbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class PrescriptionInput {
   private   Integer pid;
   private  Integer diagonsisId;
   String date;
   private  Integer pageNumber;
   private  Integer PageSize;

   public PrescriptionInput(Integer pid, Integer diagonsisId, String date) {
      this.pid = pid;
      this.diagonsisId = diagonsisId;
      this.date = date;
   }

   public PrescriptionInput(Integer pid, Integer diagonsisId) {
      this.pid = pid;
      this.diagonsisId = diagonsisId;

   }

   public PrescriptionInput(String date, Integer pageNumber, Integer pageSize) {
      this.date = date;
      this.pageNumber = pageNumber;
      PageSize = pageSize;
   }
   public LocalDate dateparser(){
      return LocalDate.parse(this.date);
   }
}
