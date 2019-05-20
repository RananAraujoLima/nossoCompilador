package br.ufc.quixada.qxd0025.semantica;

import br.ufc.quixada.qxd0025.semantica.frontend.SemanticaChecker;
import br.ufc.quixada.qxd0025.semantica.frontend.SemanticaLexer;
import br.ufc.quixada.qxd0025.semantica.frontend.SemanticaParser;
import br.ufc.quixada.qxd0025.semantica.symbol.SymbolTable;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            SemanticaLexer lexer = new SemanticaLexer(CharStreams.fromStream(System.in));
            SemanticaParser parser = new SemanticaParser(new CommonTokenStream(lexer));
            SemanticaParser.ProgramContext root = parser.program();
            SemanticaChecker checker = new SemanticaChecker();

            ParseTreeWalker.DEFAULT.walk(checker, root);

            SymbolTable symbols = checker.getSymbolTable();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
