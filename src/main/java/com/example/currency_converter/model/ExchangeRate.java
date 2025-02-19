package com.example.currency_converter.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;

@Data
public class ExchangeRate {
    @JsonProperty("base")
    private String baseCurrency;
    @JsonProperty("rates")
    private Map<String, Double> rates;
}
