package com.hau.model.jwt;

import java.io.Serializable;
import java.util.List;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwtToken;
    private List<String> grantList;
    private String username;

    public JwtResponse(String jwtToken, List<String> grantList, String username) {
        this.jwtToken = jwtToken;
        this.grantList = grantList;
        this.username = username;
    }

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public List<String> getGrantList() {
        return grantList;
    }

    public String getToken() {
        return this.jwtToken;
    }

    public String getUsername() {
        return username;
    }
}
