package com.codepath.apps.twitter.mysimpletweets.models;

/**
 * Created by kapritish on 10/30/16.
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Errors {
    private List<ErrorMessage> errors;

    public List<ErrorMessage> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorMessage> errors) {
        this.errors = errors;
    }
}