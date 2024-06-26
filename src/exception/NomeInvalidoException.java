package exception;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException() {
        super("Nome inválido. Não pode ser vazio e nem nulo.");
    }
}
