# 🚗 Projeto de Demonstração de Sobrecarga de Métodos em Java

Este projeto exemplifica de forma prática e visual o conceito de **sobrecarga de métodos** na linguagem Java. Ideal para estudantes e desenvolvedores que desejam aprender e revisar conceitos como encapsulamento e manipulação de objetos!

## 🔍 O que o projeto faz?

- **Classe `Carro`**:
  - **Atributos Privados**:  
    - `marca`
    - `modelo`
    - `cor`
  - **Métodos Sobrecarregados `setCaracteristica`**:  
    - Define **apenas a marca**.
    - Define **marca e modelo**.
    - Define **marca, modelo e cor**.
  - **Método `toString()`**:  
    - Sobrescrito para retornar uma representação textual dos atributos do objeto, facilitando a visualização dos dados.

- **Classe `Main`**:
  - Instancia um objeto da classe `Carro`.
  - Demonstra a sobrecarga dos métodos:
    - Inicialmente, define a marca (ex.: `"Ford"`).
    - Em seguida, define a marca e o modelo (ex.: `"GM"`, `"Corsa"`).
    - Por fim, define a marca, o modelo e a cor (ex.: `"Fiat"`, `"Uno"`, `"Branco"`).
  - Exibe no console a representação final do objeto, evidenciando que cada chamada atualiza o estado anterior.

## 💡 Por que usar este projeto?

- **Aprendizado Visual**: Com exemplos claros e objetivos, este projeto facilita o entendimento do conceito de sobrecarga de métodos.
- **Prática com Encapsulamento**: Demonstra a importância de manter os atributos privados e a manipulação segura dos dados.
- **Flexibilidade na Configuração de Objetos**: Mostra como métodos sobrecarregados podem oferecer diferentes formas de configurar um objeto conforme a necessidade.

---
