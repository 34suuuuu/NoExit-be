package com.E1i3.NoExit.domain.findboard.dto;

import com.E1i3.NoExit.domain.findboard.domain.FindBoard;
import com.E1i3.NoExit.domain.member.domain.Member;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FindBoardSaveReqDto {

    private String writer;
    private String title;
    private String contents;
    private LocalDateTime expirationDate;
    private int totalCapacity;
    private byte[] image;

    public FindBoard toEntity(Member member) {
        return FindBoard.builder()
                .title(this.title)
                .writer(member.getNickname())
                .contents(this.contents)
                .expirationTime(this.expirationDate)
                .totalCapacity(this.totalCapacity)
                .image(this.image)
                .member(member)
                .build();
    }


}
