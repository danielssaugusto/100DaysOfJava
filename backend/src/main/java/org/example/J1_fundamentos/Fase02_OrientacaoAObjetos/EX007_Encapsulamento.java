package org.example.J1_fundamentos.Fase02_OrientacaoAObjetos;

public class EX007_Encapsulamento {
    /* Sumário
    * 1. Modificadores de acesso
    * 2. Getters/Setters
    * 3. Validações
    * */

    /* O parâmetro public não é mais necessário na versão 25 do JDK */
    /* Usando o atalho psvm chama automaticamente o "main" */
    static void main() {
    }
    // 1. MODIFICADORES DE ACESSO
    /* Os modificadores de acesso controlam a visibilidade dos atributos de uma classe. Não se pode atribuir "public" para tudo, isso gera uma falha grave de segurança e arquitetura (acoplamento excessivo). */

    // Modificador: PRIVATE
    /* Visibilidade: apenas a própria classe */
    private String username;
    private double saldo;

    // Modificar: DEFAULT
    /* Sem modificador. Visibilidade: Classes do mesmo pacote */
    String name;
    int age;

    // Modificador: PROTECTED
    /* Visibilidade: Mesmo pacote e subclasses */
    protected String idCadastro;

    // Modificador: PUBLIC
    /* Visibilidade: Qualquer classe do projeto */
    public double nota;

    // 2. GETTERS E SETTERS
    /*
    * Um Getter é a garantia de que a leitura de um dado ser controlada ou até formatada.
    * Um Setter é o porteiro do atributo.
    * */

    // Exemplo:
    public class Funcionario {
        private String nome;
        private double salario;

        public String getNome() {
            return this.nome;
        }

        // As vezes o setter é alterado para proteger o estado do objeto
        public void setSalario(double novoSalario) {
            if (novoSalario < 1320.00) { // Regra de negócio: Salário mínimo vigente
                throw new IllegalArgumentException("O salário não pode ser menor que o salário mínimo.");
            }
            this.salario = novoSalario;
        }
    }
}
