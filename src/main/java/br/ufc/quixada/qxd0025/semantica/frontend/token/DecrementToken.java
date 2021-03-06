package br.ufc.quixada.qxd0025.semantica.frontend.token;

/**
 * Classe que representa um token do tipo (DECR).
 */
public class DecrementToken extends Token {

    public DecrementToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, não há alterações.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {

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
        return "DECR";
    }

}
