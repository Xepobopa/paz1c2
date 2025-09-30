package org.musicplayer;

import lombok.With;

import java.time.LocalDateTime;
import java.util.List;

@With
public record Prezencka(Long id, LocalDateTime date, Predmet predmet, List<Student> students) {
}
