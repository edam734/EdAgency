package edu.edagency.utils;

public class RequestTokenParams {

	String code, clientId, clientSecret, redirectUri, grantType;

	public RequestTokenParams(String code, String clientId, String clientSecret, String redirectUri, String grantType) {
		super();
		this.code = code;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.redirectUri = redirectUri;
		this.grantType = grantType;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	/**
	 * @return the redirectUri
	 */
	public String getRedirectUri() {
		return redirectUri;
	}

	/**
	 * @param redirectUri the redirectUri to set
	 */
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

}
