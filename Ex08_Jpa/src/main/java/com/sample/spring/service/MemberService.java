package com.sample.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.sample.spring.domain.Member;
import com.sample.spring.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;

	public List<Member> selectAll() {
		return memberRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION.DESC, "id"));
	}

	public Member insert(Member member) {
		Member returnMember = memberRepository.save(member);
		return returnMember;
	}

	public Optional<Member> view(Long id) {
		Optional<Member> member = memberRepository.findById(id);
		return member;
	}

	public void delete(Long id) {
		memberRepository.deleteById(id);
	}
}
