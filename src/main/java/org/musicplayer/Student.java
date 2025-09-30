package org.musicplayer;

import lombok.With;

import java.time.LocalDate;

@With
public record Student(Long id, String name, String surname, Sex sex, LocalDate birthday) {
}
