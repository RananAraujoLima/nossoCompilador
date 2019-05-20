package br.ufc.quixada.qxd0025.semantica.frontend.token;

/**
 * Classe que representa um token do tipo (INTL).
 */
public class LiteralInterToken extends Token{
    /**
     * Valor que o lexema deste token representa.
     * <p>
     * Só é inicializado quando solicitado.
     *
     * @see #interpretAttributes()
     */

    protected int numericValue;

    public LiteralInterToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    /**
     * Para este tipo de token, converte o lexema em um número do tipo {@code int},
     * caso não tenha feito ainda.
     *
     * @see Token#interpretAttributes()
     */
    @Override
    public void interpretAttributes() {
        if (stringValue != null) {
            numericValue = Integer.parseInt(stringValue);
            stringValue = null;
        }
    }

    /**
     * Obtém a representação do lexema deste token interpretada como um número.
     *
     * @return Valor numérico do lexema.
     */
    public int getNumericValue() {
        interpretAttributes();

        return numericValue;
    }

    @Override
    public String getTokenIdentifier() {
        return "INTL";
    }
}
