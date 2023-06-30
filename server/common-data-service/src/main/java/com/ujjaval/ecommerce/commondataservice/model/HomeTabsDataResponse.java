package com.ujjaval.ecommerce.commondataservice.model;

import com.ujjaval.ecommerce.commondataservice.dto.BrandsAndApparelsDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class HomeTabsDataResponse implements Serializable {

    private BrandsAndApparelsDTO transmission;
    private BrandsAndApparelsDTO engine;
    private BrandsAndApparelsDTO exhaust;
    private BrandsAndApparelsDTO body;
    private BrandsAndApparelsDTO suspension;
    private BrandsAndApparelsDTO brake;
}