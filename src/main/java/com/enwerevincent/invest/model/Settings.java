package com.enwerevincent.invest.model;

import com.enwerevincent.invest.enums.RefBonusRewardTime;
import com.enwerevincent.invest.enums.RefRewardMethod;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
public class Settings  extends BaseModel{

    private BigDecimal refFixedBonus;

    private int refPercentBonus;

    @Enumerated(EnumType.STRING)
    private RefRewardMethod refRewardMethod;

    @Enumerated(EnumType.STRING)
    private RefBonusRewardTime refBonusRewardTime;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id" , referencedColumnName = "id")
//    private AppUser user;
}
