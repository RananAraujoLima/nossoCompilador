package br.ufc.quixada.qxd0025.semantica.symbol;

import java.util.Optional;

public class SymbolTable {

    private Scope globalScope = new Scope(null);
    private Scope activeScope = globalScope;

    public boolean isDeclared(Symbol s) {
        for(
                Scope current = activeScope;
                current != null;
                current = current.getParentScope()
        ) {
            if(current.contains(s))
                return true;
        }

        return false;
    }

    public boolean tryDeclare(Symbol s, SymbolType t) {
        return activeScope.bind(s, t);
    }

    public Optional<SymbolType> getType(Symbol s) {
        Optional<SymbolType> type = Optional.empty();

        for(
                Scope current = activeScope;
                current != null;
                current = current.getParentScope()
        ) {
            type = current.getBinding(s);

            if(type.isPresent())
                break;
        }

        return type;
    }

    public void enterBlock() {
        activeScope = activeScope.createNestedScope();
    }

    public void leaveBlock() {
        activeScope = activeScope.getParentScope();
    }

}
