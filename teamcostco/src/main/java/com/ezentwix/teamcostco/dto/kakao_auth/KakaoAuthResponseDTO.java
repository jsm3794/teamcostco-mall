package com.ezentwix.teamcostco.dto.kakao_auth;

import lombok.Data;

@Data
public class KakaoAuthResponseDTO {
    String code; // 토큰 받기 요청에 필요한 인가 코드
    String error; // 인증 실패 시 반환되는 에러 코드
    String error_description; // 인증 실패 시 반환되는 에러 메시지
    String state; // 요청 시 전달한 state 값과 동일한 값
}
