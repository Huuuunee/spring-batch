package com.example.tutorial.batch.domain.batch.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobParamsRequest {
    private String paramKey;

    private String paramValue;
}
