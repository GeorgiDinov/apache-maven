package com.georgidinov;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LombokTest {

    private String fieldOne;
    private String fieldTwo;
    private String fieldThree;
}
