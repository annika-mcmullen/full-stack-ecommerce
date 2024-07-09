package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.sql.Date;

//declares product as an entity and declares the initial attributes
@Entity
@Table(name="product")
@Data
public class Product {

    //add JPA Mapping
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    //establishes relationship between products and categories. Uses category_id as foreign Key
    @ManyToOne
    @JoinColumn(name = "category_id", nullable =false)
    private ProductCategory category;

    @Column(name ="sku")
    private String sku;

    @Column(name ="name")
    private String name;

    @Column(name ="description")
    private String description;

    @Column(name ="unit_price")
    private BigDecimal unitPrice;

    @Column(name ="image_url")
    private String imageUrl;

    @Column(name ="active")
    private boolean active;

    @Column(name ="units_in_stock")
    private int unitsInStock;

    @Column(name ="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name ="last_Updated")
    @UpdateTimestamp
    private Date lastUpdated;

}
