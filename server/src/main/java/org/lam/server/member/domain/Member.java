package org.lam.server.member.domain;

import org.lam.server.member.domain.vo.Email;
import org.lam.server.member.domain.vo.Name;
import org.lam.server.member.domain.vo.Password;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Name name;

	@Embedded
	private Email email;

	@Embedded
	private Password password;

	public Member(
		final Name name,
		final Email email,
		final Password password
	) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
