package edu.edagency.utils;

public class GoogleToken {

	private String access_token;
	private String expires_in;
	private String scope;
	private String token_type;
	private String id_Token;

	public GoogleToken() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
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

	public String getId_Token() {
		return id_Token;
	}

	public void setId_Token(String id_Token) {
		this.id_Token = id_Token;
	}

}
