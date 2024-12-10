package com.analisadorlexico;

import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

import com.analisadorlexico.lexicalanalyzer.Lexer;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/analisadorlexico/input.txt";

        Lexer lexer = new Lexer(new FileReader(filePath));
        lexer.yylex();

        Map<String, Map<String, Integer>> symbolTable = lexer.getSymbolTable();

        String separator = "=========================================";

        System.out.println(BLUE + separator + RESET);
        System.out.println(GREEN + "Ocorrências dos Lexemas:" + RESET);
        System.out.println(BLUE + separator + RESET);

        symbolTable.forEach((lexeme, token) -> {
            System.out.printf(CYAN + "\t%-20s | %d ocorrências" + RESET + "\n", lexeme, token.size());
        });

        System.out.println("\n" + BLUE + separator + RESET);
        System.out.println(GREEN + "Tabela de Símbolos:" + RESET);
        System.out.println(BLUE + separator + RESET);

        symbolTable.forEach((lexeme, token) -> {
            System.out.println(PURPLE + "\tLexema: " + RESET + lexeme);
            token.forEach((key, value) -> {
                System.out.printf(CYAN + "\t\tToken: %-20s\n" + RESET, key, value);
            });
            System.out.println(YELLOW + "\t---------------------------------" + RESET);
        });

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + BLUE + separator + RESET);
            System.out.print(GREEN + "Digite o lexema que deseja filtrar (ou 'sair' para encerrar): " + RESET);
            String inputLexeme = scanner.nextLine();

            if (inputLexeme.equalsIgnoreCase("sair")) {
                System.out.println(RED + "Encerrando o programa..." + RESET);
                break;
            }

            if (symbolTable.containsKey(inputLexeme)) {
                System.out.println(CYAN + "\nTokens para o lexema '" + inputLexeme + "':" + RESET);
                Map<String, Integer> tokens = symbolTable.get(inputLexeme);
                tokens.forEach((key, value) -> {
                    System.out.printf(CYAN + "\tToken: %-20s\n" + RESET, key, value);
                });
            } else {
                System.out.println(RED + "O lexema '" + inputLexeme + "' não foi encontrado." + RESET);
            }
        }

        scanner.close();
    }
}
