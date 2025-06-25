package org.body.ecommerce.product;

import jakarta.persistence.*;
import lombok.*;
import org.body.ecommerce.category.Category;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String description;
    private BigDecimal price;
    private double availableQuantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
