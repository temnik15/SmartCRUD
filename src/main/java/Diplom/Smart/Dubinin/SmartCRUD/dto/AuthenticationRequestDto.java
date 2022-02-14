package Diplom.Smart.Dubinin.SmartCRUD.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String mail;
    private String password;
}