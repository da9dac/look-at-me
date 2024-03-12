package org.lam.server.member.domain.vo;

import java.util.Objects;

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
public class Name {

	private final int MAX_LENGTH = 20;

	@Column(name = "name", nullable = false, length = MAX_LENGTH)
	private String value;

	public Name(final String value) {
		validateNull(value);
		final String trimmedValue = value.trim();
		validate(trimmedValue);
		this.value = trimmedValue;
	}

	private void validateNull(final String value) {

	}

	private void validate(final String value) {

	}

	public Name change(final String name) {
		return new Name(name);
	}
}
