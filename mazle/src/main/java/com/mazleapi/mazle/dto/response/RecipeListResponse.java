package com.mazleapi.mazle.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeListResponse {
    private Page<RecipeData> data;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    private static class RecipeData {
        
    }

}
