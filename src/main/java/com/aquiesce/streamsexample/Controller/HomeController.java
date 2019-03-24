package com.aquiesce.streamsexample.Controller;

import com.aquiesce.streamsexample.Model.Bond;
import com.aquiesce.streamsexample.Model.Equity;
import com.aquiesce.streamsexample.Model.Instrument;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HomeController {

    @RequestMapping("/bond")
    public Bond getBond(){

        Bond b = new Bond(1L, 100F);

        return b;
    }

    @RequestMapping("/list")
    public List<Instrument> getInstruments(){

        List<Instrument> l = new ArrayList<>();

        Bond b = new Bond(1L, 100F);
        Equity e = new Equity(2L, 300F);

        l.add(b);
        l.add(e);

        return l;

    }

    @RequestMapping("/bondsOnly")
    public List<Instrument> getBondsOnly(){

        List<Instrument> l = new ArrayList<>();

        Bond b = new Bond(1L, 100F);
        Equity e = new Equity(2L, 300F);
        Bond b1 = new Bond(3L, 200F);
        Equity e1 = new Equity(4L, 310F);

        l.add(b);
        l.add(e);
        l.add(b1);
        l.add(e1);

        List<Instrument> retVal =  l.stream().filter(d -> d.getName() == "BOND").collect(Collectors.toList());

        return retVal;

    }
}
