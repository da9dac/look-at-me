package org.lam.server.member.domain.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Password {

	private final int MAX_LENGTH = 20;

	@Column(name = "password", nullable = false, length = MAX_LENGTH)
	private String password;

	public Password(final String password) {
		validateNull(password);
		final String trimmedPassword = password.trim();
		validate(trimmedPassword);
		this.password = trimmedPassword;
	}

	private void validateNull(final String password) {

	}

	private void validate(final String password) {

	}

	public Password change(final String password) {
		return new Password(password);
	}
}
