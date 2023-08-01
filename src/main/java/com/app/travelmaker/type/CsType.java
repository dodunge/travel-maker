package com.app.travelmaker.type;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CsType {
    /**
     * INQUIRY : 문의
     * DECLARATION : 신고
     * */
    INQUIRY("INQUIRY", "문의"),
    DECLARATION("DECLARATION", "신고");

    private final String code;
    private final String name;

    CsType(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
