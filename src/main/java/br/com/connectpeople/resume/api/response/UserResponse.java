package br.com.connectpeople.resume.api.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private String email;
}
