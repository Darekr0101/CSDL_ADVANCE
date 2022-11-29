package com.example.csdl_advance.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "orders")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Orders {
    @Id
    private String id;
    private Customer customer;
    @CreatedDate
    private Date createdDate;
    private List<Product> productList;

}

