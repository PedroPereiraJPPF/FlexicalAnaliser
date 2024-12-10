package com.analisadorlexico.lexicalanalyzer;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

%%

%public
%class Lexer
%standalone
%line
%column
%unicode

%{
    private Map<String, Integer> keywords = new TreeMap<>();
    private Map<String, Integer> classes = new TreeMap<>();
    private Map<String, Integer> properties = new TreeMap<>();
    private Map<String, Integer> specialSymbols = new TreeMap<>();
    private Map<String, Integer> individuals = new TreeMap<>();
    private Map<String, Integer> namespaces = new TreeMap<>();
    private Map<String, Integer> datatypes = new TreeMap<>();
    private Map<String, Integer> cardinalities = new TreeMap<>();

    private Map<String, Map<String, Integer>> symbolTable = new TreeMap<>();

    public Map<String, Map<String, Integer>> getSymbolTable() {
        return symbolTable;
    }
%}

Letter = [a-zA-Z_]
Digit = [0-9]
Word = ({Letter}(Letter|Digit)*)
Number = {Digit}*
Spaces = [ \t\n\r]+

// tokens
ClassName      = [A-Z][a-zA-Z]*_?[A-Za-z]*
Property       = [a-z][a-zA-Z]*
Individual     = [A-Z][a-zA-Z0-9]*[0-9]
Namespace      = "owl:"|"rdf:"|"xsd:"|"rdfs:"
datatypes = "anyURI"|"base64Binary"|"boolean"|"byte"|"dateTime"|"dateTimeStamp"|"decimal"|"double"|"float"|"gDay"|"gMonth"|"gMonthDay"|"gYear"|"gYearMonth"|"hexBinary"|"int"|"integer"|"language"|"long"|"Name"|"NCName"|"negativeInteger"|"NMTOKEN"|"nonNegativeInteger"|"nonPositiveInteger"|"normalizedString"|"positiveInteger"|"short"|"string"|"token"|"unsignedByte"|"unsignedInt"|"unsignedLong"|"unsignedShort"
Cardinalidade  = [0-9]+

// palavras reservadas
SOME = (S|s)(O|o)(M|m)(E|e)
ALL = (A|a)(L|l)(L|l)
VALUE = (V|v)(A|a)(L|l)(U|u)(E|e)
MIN = (M|m)(I|i)(N|n)
MAX = (M|m)(A|a)(X|x)
EXACTLY = (E|e)(X|x)(A|a)(C|c)(T|t)(L|l)(Y|y)
THAT = (T|t)(H|h)(A|a)(T|t)
NOT = (N|n)(O|o)(T|t)
AND = (A|a)(N|n)(D|d)
OR = (O|o)(R|r)
Class = "Class:"
EquivalentTo = "EquivalentTo:"
Individuals = "Individuals:"
SubClassOf = "SubClassOf:"
DisjointClasses = "DisjointClasses:"
keywords = {SOME} | {ALL} | {VALUE} | {MIN} | {MAX} | {EXACTLY} | {THAT} | {NOT} | {AND} | {OR} | {Class} | {EquivalentTo} | {Individuals} | {SubClassOf} | {DisjointClasses}

// simbolos especiais
LeftParen         = "("
RightParen         = ")"
LeftBracket       = "["
RightBracket       = "]"
LeftBrace         = "{"
RightBrace         = "}"
Comma          = ","
GreaterThan    = ">"
LessThan       = "<"
Equal         = "="
GreaterOrEqual = ">="
LessOrEqual    = "<="
SpecialSymbol = {LeftParen} | {RightParen} | {LeftBracket} | {RightBracket} | {Comma} | {GreaterThan} | {LessThan} | {LeftBrace} | {RightBrace} | {Equal} | {GreaterOrEqual} | {LessOrEqual}

%%

/* Palavras Reservadas */
{keywords}     { keywords.put(yytext().toUpperCase(), 0); symbolTable.put("keywords", keywords); }
{datatypes}    { datatypes.put(yytext().toUpperCase(), 0); symbolTable.put("datatypes", datatypes); }
{ClassName}    { classes.put(yytext().toUpperCase(), 0); symbolTable.put("classes", classes); }
{Property}     { properties.put(yytext().toUpperCase(), 0); symbolTable.put("properties", properties); }
{Individual}   { individuals.put(yytext().toUpperCase(), 0); symbolTable.put("individuals", individuals); }
{Cardinalidade} { cardinalities.put(yytext().toUpperCase(), 0); symbolTable.put("cardinalities", cardinalities); }
{SpecialSymbol} { specialSymbols.put(yytext().toUpperCase(), 0); symbolTable.put("specialSymbols", specialSymbols); }
{Namespace}    { namespaces.put(yytext().toUpperCase(), 0); symbolTable.put("namespaces", namespaces); }
{Spaces}       { /* ignore */ }
.              { throw new RuntimeException("Illegal character <" + yytext() + ">"); }
