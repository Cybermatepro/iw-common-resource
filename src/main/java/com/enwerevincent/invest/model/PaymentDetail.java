package com.enwerevincent.invest.model;

import com.enwerevincent.invest.enums.PaymentCurrency;
import com.enwerevincent.invest.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetail {

    private String walletAddress;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    private PaymentCurrency paymentCurrency;

}
