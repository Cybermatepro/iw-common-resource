package com.enwerevincent.invest.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactInfo {

    private String country;
    private String state;
    private String postalCode;
    private String address;
    private String province;

}
