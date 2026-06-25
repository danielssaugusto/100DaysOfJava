# Teste de Performance 3 (TP3) - Fundamentos de Desenvolvimento com Java

Este repositório contém a resolução dos exercícios propostos para o Teste de Performance 3 (TP3) da disciplina de **Fundamentos de Desenvolvimento com Java**. O objetivo deste trabalho é praticar e consolidar os conceitos de Programação Orientada a Objetos (POO), como classes, objetos, atributos, métodos, encapsulamento (getters/setters) e construtores.

---

## 📝 Lista de Exercícios

### Exercício 1: Conceitos de Classe, Objeto, Campos e Métodos
* **Enunciado:** Elabore uma explicação clara e objetiva dos conceitos de classe, objeto, campos (ou atributos) e métodos. Em seguida, crie um exemplo simples que ilustre esses conceitos na prática.
* **Requisitos:** Declaração de uma classe, pelo menos dois atributos, pelo menos um método que manipule os atributos e a instanciação de um objeto.

### Exercício 2: Criando a Classe "Produto"
* **Enunciado:** Com base no contexto de gerenciamento de um supermercado, declare uma classe chamada `Produto` contendo os atributos básicos para o cadastro de itens.
* **Atributos:** `nome` (String), `preco` (double) e `quantidadeEmEstoque` (int).
* **Teoria:** Explicar brevemente a importância de cada atributo no contexto do sistema.

### Exercício 3: Métodos Básicos da Classe "Produto"
* **Enunciado:** Aprimore a classe `Produto` adicionando os seguintes métodos de manipulação e exibição de dados:
    * `alterarPreco(double novoPreco)`: Atualiza o preço do produto.
    * `alterarQuantidade(int novaQuantidade)`: Atualiza a quantidade em estoque.
    * `exibirInformacoes()`: Exibe no console o estado atual do objeto (nome, preço e quantidade).

### Exercício 4: Testando a Classe "Produto"
* **Enunciado:** Crie uma classe de teste (ex: `AppProduto` ou `Main`) com o método principal (`main`) para validar o comportamento da classe `Produto`.
* **Fluxo do Teste:** Instanciar o produto, atribuir valores iniciais, chamar os métodos de alteração e exibir o resultado final para confirmar as mudanças.

### Exercício 5: Criando Métodos de Propriedade (Getters e Setters)
* **Enunciado:** Implemente métodos de leitura (`get`) e atualização (`set`) para cada um dos atributos da classe `Produto`.
* **Requisitos:** Demonstrar o uso dos novos métodos na classe de teste e explicar textualmente a utilidade dos getters e setters no gerenciamento e organização do código.

### Exercício 6: Adicionando Construtores à Classe "Produto"
* **Enunciado:** Crie um construtor na classe `Produto` que receba parâmetros para inicializar obrigatoriamente todos os atributos no momento da criação do objeto.
* **Requisitos:** Demonstrar o uso do construtor no `main` e justificar por que o uso de construtores facilita o desenvolvimento em comparação com múltiplos métodos `set`.

### Exercício 7: Modelando uma Conta Bancária
* **Enunciado:** Inicie a modelagem de um sistema de gerenciamento bancário criando a classe `Conta`.
* **Atributos:** `titular` (String), `numero` (int), `agencia` (String), `saldo` (double) e `dataAbertura` (String).

### Exercício 8: Criando Métodos para a Classe Conta
* **Enunciado:** Adicione lógica de negócios à classe `Conta` através dos seguintes métodos:
    * `saca(double valor)`: Retira o valor informado do saldo.
    * `deposita(double valor)`: Adiciona o valor informado ao saldo.
    * `calculaRendimento()`: Devolve (retorna) o valor correspondente a 10% do saldo atual.

### Exercício 9: Testando a Classe Conta
* **Enunciado:** Crie a classe `TestaConta` com o método `main`.
* **Fluxo do Teste:** Instancie uma `Conta`, atribua os dados iniciais, execute operações de saque, depósito e cálculo de rendimento, exibindo o saldo antes e depois de cada ação para validação.

### Exercício 10: Definindo Classes para Formas Geométricas
* **Enunciado:** Sem utilizar conceitos avançados como herança, estruture a base de um sistema de cálculo geométrico criando duas classes independentes:
    * Class `Circulo`: Atributo `raio` (double).
    * Class `Esfera`: Atributo `raio` (double).
* **Teoria:** Explicar por que o atributo raio é fundamental para ambas as formas.

### Exercício 11: Criando Métodos de Cálculo Geométrico
* **Enunciado:** Adicione as fórmulas matemáticas de cálculo dentro de suas respectivas classes (utilizando retornos e evitando impressões diretas nos métodos):
    * No `Circulo`: Método `calcularArea()` para retornar $\pi \times r^2$.
    * Na `Esfera`: Método `calcularVolume()` para retornar $\frac{4.0}{3.0} \times \pi \times r^3$.

### Exercício 12: Testando as Classes de Figuras
* **Enunciado:** Crie a classe `TestaFiguras` com o método `main`.
* **Fluxo do Teste:** Instanciar um objeto de cada classe, definir o raio (ex: 3.0 para o círculo e 5.0 para a esfera), chamar os métodos de cálculo correspondentes e exibir os resultados formatados no console.

---

## 🛠️ Como Executar o Projeto

Caso os arquivos estejam separados por contexto, você pode compilá-los e executá-los via terminal utilizando o compilador do Java (`javac`):

### Contexto do Supermercado (Produto)
```bash
javac Produto.java ProdutoDemo.java
java ProdutoDemo