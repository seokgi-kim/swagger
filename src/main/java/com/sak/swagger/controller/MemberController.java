package com.sak.swagger.controller;

import com.sak.swagger.domain.Member;
import com.sak.swagger.repository.MemberRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seokgi4885@gmail.com on 2020-08-14.
 */
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/view/member")
    public String viewMember() {
        return "Member.html View!";
    }

    @GetMapping("/api/members")
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @GetMapping("/api/member/{id}")
    public Optional<Member> findMember(@PathVariable Long id) {
        return memberRepository.findById(id);
    }

    @PostMapping("/api/member")
    public Member saveMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @PutMapping("/api/member")
    public Member updateMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @DeleteMapping("/api/member/{id}")
    public String deleteMember(@PathVariable Member member) {
        memberRepository.delete(member);
        return "delete";
    }


}
