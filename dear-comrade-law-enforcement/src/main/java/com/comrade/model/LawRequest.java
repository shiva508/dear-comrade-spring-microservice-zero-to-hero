package com.comrade.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LawRequest {
    //@JsonProperty("law_name")
    private String lawName;
}
