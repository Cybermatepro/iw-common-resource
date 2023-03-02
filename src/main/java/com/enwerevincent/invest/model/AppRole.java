package com.enwerevincent.invest.model;


import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppRole extends  BaseModel{

    private String role;
}
