package com.login.login_form.service;

import com.login.login_form.domain.Member;
import com.login.login_form.dto.MemberDto;
import com.login.login_form.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MemberServiceImpl implements MemberService{
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member save(MemberDto memberDto) {
        return memberRepository.save(
                Member.builder()
                        .username(memberDto.getUsername())
                        .password(passwordEncoder.encode(memberDto.getPassword()))
                        .roleType(memberDto.getRoleType())
                        .build()
        );
    }
}
