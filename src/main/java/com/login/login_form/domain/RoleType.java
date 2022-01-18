package com.login.login_form.domain;

import lombok.Getter;

@Getter
public enum RoleType {
    ROLE_USER("ROLE_USER", "일반"), ROLE_ADMIN("ROLE_ADMIN", "관리자");

    String auth;
    String desc;

    RoleType(String auth, String desc) {
        this.auth = auth;
        this.desc = desc;
    }
}
