package br.ufc.quixada.qxd0025.semantica.frontend;

import br.ufc.quixada.qxd0025.semantica.symbol.Symbol;
import br.ufc.quixada.qxd0025.semantica.symbol.SymbolTable;
import br.ufc.quixada.qxd0025.semantica.symbol.SymbolType;

import java.util.IdentityHashMap;
import java.util.Map;

public class SemanticaChecker extends SemanticaBaseListener {

    private SymbolTable symbols = new SymbolTable();
    private Map<SemanticaParser.ExpressionContext, SymbolType> expressionType = new IdentityHashMap<>();

    public SymbolTable getSymbolTable() {
        return symbols;
    }

    @Override
    public void enterStatement(SemanticaParser.StatementContext ctx) {
        if (ctx.statement().size() > 0) {
            symbols.enterBlock();
        }
    }

    @Override
    public void exitStatement(SemanticaParser.StatementContext ctx) {
        if (ctx.statement().size() > 0) {
            symbols.leaveBlock();
        }
    }

    @Override
    public void enterVardecl(SemanticaParser.VardeclContext ctx) {
        Symbol symbol = Symbol.getSymbolFor(ctx.ID().getText());
        // FIXME Obter a enumeração correta
        SymbolType type = SymbolType.fromString(ctx.type().getText());
        if (!symbols.tryDeclare(symbol, type)) {
            // TODO Erro semântico => Declarando novamente
        }
    }

    @Override
    public void exitVardecl(SemanticaParser.VardeclContext ctx) {
        // NOTE Entre tipos distintos, apenas FLOAT <- INT é permitido

        if (
                SymbolType.fromString(ctx.type().getText()) != expressionType.get(ctx.expression())
                        && (
                        SymbolType.fromString(ctx.type().getText()) != SymbolType.FLOAT
                                && expressionType.get(ctx.expression()) != SymbolType.INTEGER
                )
        ) {
            // TODO Erro semantico => Tipos incompatíveis
        }
    }

    @Override
    public void exitConditional(SemanticaParser.ConditionalContext ctx) {
        if (expressionType.get(ctx.expression()) != SymbolType.BOOLEAN) {
            // TODO Erro semântico => tipo incompatível
        }
    }

    @Override
    public void exitOrderingExpression(SemanticaParser.OrderingExpressionContext ctx) {
        if (expressionType.get(ctx.expression(0)).isMaybeArithmetic()
                && expressionType.get(ctx.expression(1)).isMaybeArithmetic()) {
            // NOTE `isMaybeArithmetic` é usado, pois vamos considerar que expressões já detectadas
            //      como incorretas não necessitam propagar o erro (evitar "combo" de erros).
            expressionType.put(ctx, SymbolType.BOOLEAN);
        } else {
            expressionType.put(ctx, SymbolType.INVALID);
            // TODO Erro semantico => Tipos incompatíveis
        }
    }

    @Override
    public void exitEqualityExpression(SemanticaParser.EqualityExpressionContext ctx) {
        // NOTE Entre tipos distintos, apenas FLOAT <- INT é permitido

        if (
                expressionType.get(ctx.expression(0)) == expressionType.get(ctx.expression(1))
                        || (
                        expressionType.get(ctx.expression(0)) == SymbolType.FLOAT
                                && expressionType.get(ctx.expression(1)) == SymbolType.INTEGER
                )
        ) {
            expressionType.put(ctx, SymbolType.BOOLEAN);
        } else {
            expressionType.put(ctx, SymbolType.INVALID);
            // TODO Erro semantico => Tipos incompatíveis
        }
    }
}

