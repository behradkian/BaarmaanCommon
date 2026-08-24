package ir.radman.general.dto;

import ir.radman.general.enumeration.Currency;
import ir.radman.util.string.StringUtility;

import java.math.BigDecimal;

/**
 * @author : Pedram Behradkian
 * @date : 2025/11/09
 */
public record AmountDto(BigDecimal amount, Currency currency) {

    @Override
    public String toString() {
        return StringUtility.toJsonString(this);
    }
}