package com.elpsy.graphql.spring.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.elpsy.graphql.spring.dao.entity.Forex;
import com.elpsy.graphql.spring.service.ForexService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ForexMutation implements GraphQLMutationResolver {

    private final ForexService forexService;

    public Forex createFX(final String code, final String type, final Double price, final Double high, final Double low, final Double percentage, String bias){
        return this.forexService.createFx(code,type,price,high,low,percentage,bias);
    }

}
