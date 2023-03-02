package com.enwerevincent.invest.model;


import com.enwerevincent.invest.enums.AppUserStatus;
import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class AppUser extends BaseModel{


    private String firstName;
    private String lastName;
    private String gender;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> roles;

    @Enumerated(EnumType.STRING)
    private AppUserStatus status;

    private String refCode;

    private String referrerCode;

    @Embedded
    @Builder.Default
    private PaymentDetail paymentDetail = new PaymentDetail();

    @Embedded
    @Builder.Default
    private ContactInfo contactInfo = new ContactInfo();

}
