package br.com.emerson.model;

import javax.inject.Named;

@Named
public class InfoSystem {

    private String name;
    private String description;
    private String version;

    public InfoSystem() {
        this.name = "spring-boot-web-rest";
        this.description = "Model of the web rest application using spring boot";
        this.version = "0.0.1";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
