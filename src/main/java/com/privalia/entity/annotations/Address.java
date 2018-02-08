package com.privalia.entity.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("address")
public class Address {

    @Autowired
    @Value("1")
    private int idAddress;

    @Autowired
    @Value("Baker Street, 221b, London")
    private String street;
}
