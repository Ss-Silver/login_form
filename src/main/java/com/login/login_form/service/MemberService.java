package com.login.login_form.service;

import com.login.login_form.domain.Member;
import com.login.login_form.dto.MemberDto;

public interface MemberService {
    Member save(MemberDto memberDto);
}
