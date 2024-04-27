package me.woo.springbootdeveloper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestService {

    final MemberRepository memberRepository;

    public List<Member> getAllMenbers() {
        return memberRepository.findAll();
    }
}
