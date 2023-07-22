package com.ems.ems.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Long eid;

    private String name;

    private String city;

    private String email;

    private String mobile;

    private List<BonusDto> bonuses;
}
