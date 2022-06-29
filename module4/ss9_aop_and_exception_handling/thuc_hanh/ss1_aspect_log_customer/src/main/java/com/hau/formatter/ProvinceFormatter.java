package com.hau.formatter;

import com.hau.model.Province;
import com.hau.service.IProvinceService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class ProvinceFormatter implements Formatter<Province> {

    private final IProvinceService IProvinceService;

    public ProvinceFormatter(IProvinceService IProvinceService) {
        this.IProvinceService = IProvinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        Optional<Province> provinceOptional = IProvinceService.findOne(Long.valueOf(text));
        return provinceOptional.orElse(null);
    }

    @Override
    public String print(Province object, Locale locale) {
        return object.toString();
    }
}
