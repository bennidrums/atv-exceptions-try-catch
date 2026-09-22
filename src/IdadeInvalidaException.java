public class IdadeInvalidaException extends Exception{

    public IdadeInvalidaException() {
        super("Usuário precisa ser maior de idade para se cadastrar.");
    }
}