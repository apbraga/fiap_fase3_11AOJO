package br.com.fiap.abctechapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Negative;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderLocationDto {
    @Negative
    @Positive
    private Double latitude;
    @Negative
    @Positive
    private Double longitude;
    @PastOrPresent
    private Date date;
}
