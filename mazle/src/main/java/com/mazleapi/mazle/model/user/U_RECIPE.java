package com.mazleapi.mazle.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document(collation = "U_RECIPE")
public class U_RECIPE {
    @Id
    private long recipe_id;
    private String name;

}
