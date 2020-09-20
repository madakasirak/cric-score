package com.gb.cricscore.model.match;

import com.gb.cricscore.model.people.Umpire;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Match {
    private String matchId;
    private Tournament tournament;
    private final PlayedTeams playedTeams;
    private String venue;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Umpire> umpires;
    private String winner;

    public Match(PlayedTeams playedTeams) {
        this.playedTeams = playedTeams;
    }
}