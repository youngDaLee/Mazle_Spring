package com.mazleapi.mazle.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeListRequest {
    private String searchKeyword;
    private String recipeName;
    private Integer startPrice;
    private Integer endPrice;
    private List<String> tags;
    private String largeCategory;
    private String mediumCategory;
    private String smallCategory;
}
