package com.analisadorlexico;

import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

import com.analisadorlexico.lexicalanalyzer.Lexer;

public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/analisadorlexico/input.txt";

        Lexer lexer = new Lexer(new FileReader(filePath));
        lexer.yylex();

        Map<String, Map<String, Integer>> symbolTable = lexer.getSymbolTable();

        // Separador para melhorar a legibilidade
        String separator = "=========================================";

        // Ocorrências dos Lexemas
        System.out.println(separator);
        System.out.println("Ocorrências dos Lexemas:");
        System.out.println(separator);

        symbolTable.forEach((lexeme, token) -> {
            System.out.printf("\t%-20s | %d ocorrências\n", lexeme, token.size());
        });

        // Tabela de Símbolos
        System.out.println("\n" + separator);
        System.out.println("Tabela de Símbolos:");
        System.out.println(separator);

        symbolTable.forEach((lexeme, token) -> {
            System.out.println("\tLexema: " + lexeme);
            token.forEach((key, value) -> {
                System.out.printf("\t\tToken: %-20s\n", key, value);
            });
            System.out.println("\t---------------------------------");
        });

        // Nova funcionalidade: Filtrar por lexema
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + separator);
            System.out.print("Digite o lexema que deseja filtrar (ou 'sair' para encerrar): ");
            String inputLexeme = scanner.nextLine();

            if (inputLexeme.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (symbolTable.containsKey(inputLexeme)) {
                System.out.println("\nTokens para o lexema '" + inputLexeme + "':");
                Map<String, Integer> tokens = symbolTable.get(inputLexeme);
                tokens.forEach((key, value) -> {
                    System.out.printf("\tToken: %-20s\n", key, value);
                });
            } else {
                System.out.println("O lexema '" + inputLexeme + "' não foi encontrado.");
            }
        }

        scanner.close();
    }
}
