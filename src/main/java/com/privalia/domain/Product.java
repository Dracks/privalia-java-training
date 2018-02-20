package com.privalia.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated product ID")
    private  Integer id;

    @Version
    @ApiModelProperty(notes = "The auto-generated version of the product")
    private Integer version;

    @ApiModelProperty(notes = "The application-specific product ID")
    private String productId;

    @ApiModelProperty(notes = "The product description")
    @Size(min = 2, max = 200)
    private String description;

    @ApiModelProperty(notes="The image URL of the product")
    @Size(min= 6, max= 400)
    private String imageUrl;

    @ApiModelProperty(notes = "The price of the product", required = true)
    @NotNull
    @Min(1)
    private BigDecimal price;
}
