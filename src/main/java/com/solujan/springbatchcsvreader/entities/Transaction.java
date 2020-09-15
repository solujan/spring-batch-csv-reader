package com.solujan.springbatchcsvreader.entities;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Transaction {
    private Integer id;
    private LocalDate date;
    private String type;

}
