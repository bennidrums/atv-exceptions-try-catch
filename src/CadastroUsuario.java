import java.util.Scanner;
public class CadastroUsuario {

    public void cadastrarUsuario(String nome, int idade) throws IdadeInvalidaException {
        if(idade < 18){
            throw new IdadeInvalidaException();
        }
        System.out.println("usuário: " +nome+ " foi cadastrado com sucesso.");
    }
    public static void main(String[] args) {

        //VARIAVEIS
        String nomeUsuario;
        int idadeUsuario;

        //ENTRADA DE DADOS
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite seu nome: ");
        nomeUsuario = sc.nextLine();
        System.out.print("Digite sua idade: ");
        idadeUsuario = sc.nextInt();

        CadastroUsuario cadastro = new CadastroUsuario();
        try{
        cadastro.cadastrarUsuario(nomeUsuario, idadeUsuario);
        }
        catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Processo de cadastro finalizado.");
        }
    }
}