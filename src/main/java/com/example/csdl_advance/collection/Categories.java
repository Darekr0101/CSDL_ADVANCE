package com.example.csdl_advance.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "categories")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Categories {
    @Id
    private String id;
    private String categoryName;
    private String description;

}

