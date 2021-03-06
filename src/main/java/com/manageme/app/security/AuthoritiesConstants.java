package com.manageme.app.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    
    public static final String HUMAN_RESOURCES = "ROLE_HUMAN_RESOURCES";
    
    public static final String FUNCTIONAL_REPRESENTATIVE = "ROLE_FUNCTIONAL_REPRESENTATIVE";

    public static final String REGULAR_EMPLOYEE = "ROLE_REGULAR_EMPLOYEE";
    
    private AuthoritiesConstants() {
    }
}
