package com.elpsy.graphql.spring.service;


import com.elpsy.graphql.spring.dao.entity.Forex;
import com.elpsy.graphql.spring.dao.repo.ForexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ForexService {

    private final ForexRepository forexRepository;

    @Transactional
    public Forex createFx(String code, String type, Double price, Double high, Double low, Double percentage, String bias){
        final Forex forex = Forex.builder()
                .code(code)
                .type(type)
                .price(price)
                .high(high)
                .low(low)
                .percentage(percentage)
                .bias(bias).build();
        return this.forexRepository.save(forex);
    }

    @Transactional(readOnly = true)
    public List<Forex> getAllFxRates(final int count) {
        return this.forexRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public Optional<Forex> getFX(final String code) {
        return this.forexRepository.findFirstByCode(code);
    }

}
