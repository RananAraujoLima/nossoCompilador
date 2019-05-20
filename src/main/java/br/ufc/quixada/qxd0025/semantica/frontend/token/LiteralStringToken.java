package br.ufc.quixada.qxd0025.semantica.frontend.token;

/**
 * Classe que representa um token do tipo (STRL).
 */
public class LiteralStringToken extends Token {

    public LiteralStringToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, descarta o {@code "} do lexema, caso possua e não tenha sido descartado ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if (stringValue != null && stringValue.charAt(0) == '"' && stringValue.charAt(stringValue.length() - 1) == '"') {
            stringValue = stringValue.substring(1,stringValue.length() - 2);
        }
    }

    /**
     * Obtém o identificador associado ao token.
     *
     * @return Identificador de variável associado.
     */
    public String getVariableIdentifier() {
        interpretAttributes();

        return stringValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "STRL";
    }

}
