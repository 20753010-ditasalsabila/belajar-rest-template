package com.enigma.belajar_rest_template.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo {
    private String id;
    private String name;
    private Boolean isCompleted;
}
