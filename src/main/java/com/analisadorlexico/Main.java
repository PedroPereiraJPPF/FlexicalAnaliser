package com.analisadorlexico;
import java.io.FileReader;
import java.util.Map;

import com.analisadorlexico.lexicalanalyzer.Lexer;

public class Main {
     public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/analisadorlexico/input.txt";

        Lexer lexer = new Lexer(new FileReader(filePath));

        lexer.yylex();

        Map<String, Map<String, Integer>> symbolTable = lexer.getSymbolTable();

        symbolTable.forEach((lexeme, token) -> {
            System.out.println("Lexeme: " + lexeme);
            token.forEach((key, value) -> {
                System.out.println("\tToken: " + key);
            });
        });
    }
}