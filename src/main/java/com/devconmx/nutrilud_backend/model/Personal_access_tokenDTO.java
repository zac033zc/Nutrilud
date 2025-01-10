package com.devconmx.nutrilud_backend.model;

import java.time.LocalDateTime;

public class Personal_access_tokenDTO {
    private Long id;
    private Long tokenable_type;
    private Long tokenable_id;
    private String name;
    private String token;
    private String abilities;
    private String last_used_at;
    private String expires_at;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Personal_access_tokenDTO() {
    }

    public Personal_access_tokenDTO(Long id, Long tokenable_type, Long tokenable_id, String name, String token,
            String abilities, String last_used_at, String expires_at, LocalDateTime created_at,
            LocalDateTime updated_at) {
        this.id = id;
        this.tokenable_type = tokenable_type;
        this.tokenable_id = tokenable_id;
        this.name = name;
        this.token = token;
        this.abilities = abilities;
        this.last_used_at = last_used_at;
        this.expires_at = expires_at;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTokenable_type() {
        return tokenable_type;
    }

    public void setTokenable_type(Long tokenable_type) {
        this.tokenable_type = tokenable_type;
    }

    public Long getTokenable_id() {
        return tokenable_id;
    }

    public void setTokenable_id(Long tokenable_id) {
        this.tokenable_id = tokenable_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getLast_used_at() {
        return last_used_at;
    }

    public void setLast_used_at(String last_used_at) {
        this.last_used_at = last_used_at;
    }

    public String getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(String expires_at) {
        this.expires_at = expires_at;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
