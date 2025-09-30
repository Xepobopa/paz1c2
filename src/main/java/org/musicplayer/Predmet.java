package org.musicplayer;

import lombok.With;

import java.time.LocalDate;
import java.util.List;

@With
public record Predmet(Long id, String title, LocalDate year, List<Student> students) {
}
