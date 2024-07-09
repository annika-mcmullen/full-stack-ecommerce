package com.ecommerce.dao;

import com.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//specify resource relationship explicitly to avoid using defaults
@RepositoryRestResource(collectionResourceRel = "productCategory", path ="product_category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
