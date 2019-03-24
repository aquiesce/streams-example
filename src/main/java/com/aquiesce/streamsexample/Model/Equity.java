package com.aquiesce.streamsexample.Model;

import lombok.Data;

@Data
public class Equity extends Instrument {

    private Float coupon;

    public Equity(Long id, Float coupon){

        this.coupon = coupon;
        super.setId(id);
        super.setName("EQUITY");
        super.setPrice(99F);

    }
}
