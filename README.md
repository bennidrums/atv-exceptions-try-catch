# M25 — Exceptions, Try e Catch

Atividade prática do curso **EBAC Back-end Java v2** sobre validação de regras de negócio e tratamento de exceções em Java.

## O que o programa faz

Solicita nome e idade para um cadastro. O método `cadastrarUsuario()` rejeita idades abaixo de 18 anos lançando uma exceção personalizada; o `main` captura essa exceção e apresenta a mensagem ao usuário. O bloco `finally` informa que o processo terminou.

## Conceitos praticados

- Exceção personalizada `IdadeInvalidaException`, que estende `Exception`.
- Lançamento de exceção com `throw`.
- Declaração de exceção com `throws`.
- Tratamento com `try/catch`.
- Bloco `finally`.
- Separação entre a regra de cadastro e o fluxo de entrada no terminal.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `src/CadastroUsuario.java).

## Limitações conhecidas

É uma demonstração de validação em memória. O cadastro não é persistido e entradas não numéricas para idade não são tratadas nesta versão.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** exceções e validação de regras
