package com.login.login_form.dto;

import com.login.login_form.domain.RoleType;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDto {
    private String username;
    private String password;
    private RoleType roleType;


}
