package com.elpsy.graphql.spring.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.elpsy.graphql.spring.dao.entity.Forex;
import com.elpsy.graphql.spring.service.ForexService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ForexQuery implements GraphQLQueryResolver {

    private ForexService forexService;

    public List<Forex> getForexRates(final int count){
        return this.forexService.getAllFxRates(count);
    }

    public Optional<Forex> fx(final String code){
        return this.forexService.getFX(code);
    }
}
