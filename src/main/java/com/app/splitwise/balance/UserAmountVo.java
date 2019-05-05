package com.app.splitwise.balance;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;
import lombok.experimental.Wither;

import java.math.BigDecimal;
import java.util.Map;

@Value
@Wither
@Builder(toBuilder = true)
@JsonDeserialize(builder = UserAmountVo.UserAmountVoBuilder.class)
public class UserAmountVo {
    public UserAmountVo(BigDecimal netBalance, Map<String, BigDecimal> youWillGiveMoneyToUser, Map<String, BigDecimal> userWillGiveYouMoney) {
        this.netBalance = netBalance;
        this.youWillGiveMoneyToUser = youWillGiveMoneyToUser;
        this.userWillGiveYouMoney = userWillGiveYouMoney;
    }

    private BigDecimal netBalance;

    private Map<String, BigDecimal> youWillGiveMoneyToUser;

    private Map<String, BigDecimal> userWillGiveYouMoney;
}
