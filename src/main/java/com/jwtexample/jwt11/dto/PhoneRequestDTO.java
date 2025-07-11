package com.jwtexample.jwt11.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhoneRequestDTO {
    private Long phoneId;
    private String number;
    private Long userId;
}
