package com.analisadorlexico.LexicalAnaliser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    private String lexeme, token;

    private int line, column;

    public Token(String token) {
        this.token = token;
    }
}
