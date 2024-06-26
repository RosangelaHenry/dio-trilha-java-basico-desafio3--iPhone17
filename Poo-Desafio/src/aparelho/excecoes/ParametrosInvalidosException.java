package aparelho.excecoes;

import java.io.Serializable;

public class ParametrosInvalidosException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    // Construtor da exceção
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
