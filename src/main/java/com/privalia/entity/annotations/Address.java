package com.privalia.entity.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component()
public class Address {
    @Value("1")
    private int idAddress;
    @Value("Baker Street, 221b, London")
    private String street;
}
