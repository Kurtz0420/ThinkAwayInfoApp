package com.homie.psychq.google_apis;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*Requesting Access Token Parameters*/
public class AccessToken {


    @SerializedName("access_token")
    @Expose
    private String access_token;

    @SerializedName("expires_in")
    @Expose
    private int expires_in;

    @SerializedName("scope")
    @Expose
    private String scope;

    @SerializedName("token_type")
    @Expose
    private String token_type;


    public AccessToken() {
    }

    public AccessToken(String access_token, int expires_in, String scope, String token_type) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.scope = scope;
        this.token_type = token_type;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "access_token='" + access_token + '\'' +
                ", expires_in=" + expires_in +
                ", scope='" + scope + '\'' +
                ", token_type='" + token_type + '\'' +
                '}';
    }
}
