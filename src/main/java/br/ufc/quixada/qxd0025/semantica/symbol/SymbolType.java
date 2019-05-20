package br.ufc.quixada.qxd0025.semantica.symbol;

public enum SymbolType {
    INTEGER,
    FLOAT,
    BOOLEAN,
    INVALID;

    public static SymbolType fromString(String str) {
        switch (str) {
            case "int":
                return INTEGER;
            case "float":
                return FLOAT;
            case "bool":
                return BOOLEAN;
            default:
                return INVALID;
        }
    }

    public boolean isArithmetic() {
        return this == INTEGER || this == FLOAT;
    }

    public boolean isMaybeArithmetic() {
        return this == INTEGER || this == FLOAT || this == INVALID;
    }

    public boolean maybeEquals(SymbolType t) {
        return this == t || this == INVALID;
    }
}
