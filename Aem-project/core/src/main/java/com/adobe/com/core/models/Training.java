package com.adobe.com.core.models;

import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.Resource;
import javax.inject.Inject;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Training {

    @ValueMapValue
    @Default(values = "GEEKS")
    private String fname;

    @ValueMapValue
    @Default(values = "GEEKS")
    private String lname;


    public   String getFirstName(){
        return fname;
    }

    public String getLastname() {
        return lname;
    }
}
