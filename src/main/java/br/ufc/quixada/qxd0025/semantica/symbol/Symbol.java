package br.ufc.quixada.qxd0025.semantica.symbol;

import java.util.IdentityHashMap;
import java.util.Map;

public class Symbol {

    private static Map<String, Symbol> symbols = new IdentityHashMap<>();

    private final String identifier;

    private Symbol(String id) {
        identifier = id;
    }

    public static Symbol getSymbolFor(String identifier) {
        String id = identifier.intern();
        Symbol s = symbols.get(id);

        if(s == null) {
            s = new Symbol(id.intern());
            symbols.put(id, s);
        }

        return s;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Symbol) {
            return this == obj || this.identifier.equals(((Symbol) obj).identifier);
        }

        return super.equals(obj);
    }
}
