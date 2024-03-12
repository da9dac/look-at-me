package org.lam.server.member.domain.vo;

import java.util.Objects;
import java.util.regex.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Getter
public class Email {

	private static final String EMAIL_REGEX = "^([\\w\\.\\_\\-])*[a-zA-Z0-9]+([\\w\\.\\_\\-])*([a-zA-Z0-9])+([\\w\\.\\_\\-])+@([a-zA-Z0-9]+\\.)+[a-zA-Z0-9]{2,8}$";

	@Column(name = "email", nullable = false, unique = true)
	private String value;

	public Email(final String value) {
		validate(value);
		this.value = value;
	}

	private void validate(final String value) {

	}

	private boolean isNotMatchEmailForm(final String value) {
		return !Pattern.matches(EMAIL_REGEX, value);
	}
}
