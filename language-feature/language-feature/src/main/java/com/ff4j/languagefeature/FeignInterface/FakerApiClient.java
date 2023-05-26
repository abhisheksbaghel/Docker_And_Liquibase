package com.ff4j.languagefeature.FeignInterface;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.ff4j.languagefeature.configuration.FeignConfig;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;

@FeignClient(name="faker-api-service", url="https://fakerapi.it/api/v1/persons?_locale="+"${locale.language}", configuration = FeignConfig.class)
public interface FakerApiClient {
    @RequestMapping(method = RequestMethod.GET)
    @JsonProperty("data")
    JsonNode getUsers();
}
