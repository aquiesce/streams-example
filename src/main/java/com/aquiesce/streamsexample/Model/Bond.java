package com.aquiesce.streamsexample.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Bond extends Instrument  {

    private Float coupon;

    public Bond(Long id, Float coupon){

        super.setId(id);
        super.setName("BOND");
        super.setPrice(1000F);
        this.coupon = coupon;
    }
}
