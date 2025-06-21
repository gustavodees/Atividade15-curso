# Calculadora de Conta Telefônica (Uso de Minutos)

Este é um programa Java que calcula o valor a ser pago por um serviço telefônico com base na quantidade de minutos utilizados em um mês. Ele utiliza a biblioteca Swing para exibir janelas de diálogo para interação com o usuário.

## Descrição

O programa solicita ao usuário que digite o número de minutos utilizados no mês. O cálculo do valor a pagar é feito da seguinte forma:

* Se o número de minutos utilizados for menor ou igual a 100, o valor a pagar é fixo em R$ 50.00.
* Se o número de minutos utilizados for maior que 100, os primeiros 100 minutos custam R$ 50.00, e cada minuto excedente tem um custo adicional de R$ 2.00.

O programa exibe o valor total a ser pago em uma janela de diálogo.

## Como Executar

Para executar este código, você precisará ter o Java Development Kit (JDK) instalado em seu sistema. Siga os passos abaixo:

1.  **Salve o código:** Salve o código Java fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`. Certifique-se de que a estrutura de pastas seja `principal/Main.java`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até a pasta onde você salvou o arquivo `principal` e execute o seguinte comando para compilar o código:

    ```bash
    javac principal/Main.java
    ```

    Isso criará um arquivo chamado `Main.class` dentro da pasta `principal`.

3.  **Execute o programa:** No mesmo terminal ou prompt de comando, execute o programa com o seguinte comando:

    ```bash
    java principal.Main
    ```

    Uma janela de diálogo aparecerá solicitando a entrada do número de minutos utilizados.

## Como Usar

1.  Ao executar o programa, uma janela de diálogo será exibida com a mensagem "Digite o os minutos utilizados neste mês:".
2.  Digite o número de minutos que você utilizou no mês e clique em "OK".
3.  Uma outra janela de diálogo será exibida, mostrando o valor total a ser pago de acordo com a sua utilização.
4.  O programa será encerrado após exibir a mensagem.

## Explicação do Código

* `package principal;`: Declara o pacote ao qual a classe `Main` pertence.
* `import javax.swing.*;`: Importa a biblioteca Swing, que fornece classes para criar interfaces gráficas, como janelas de diálogo.
* `public class Main { ... }`: Define a classe principal do programa.
* `public static void main(String[] args) { ... }`: O método principal onde a execução do programa começa.
* `double minutos = Double.parseDouble(JOptionPane.showInputDialog(...));`: Exibe uma janela de diálogo para obter a entrada do usuário (o número de minutos utilizados) e converte a entrada para um tipo `double`.
* `if(minutos <= 100){ ... }`: Verifica se o número de minutos é menor ou igual a 100. Se verdadeiro, exibe uma mensagem informando que o valor a pagar é R$ 50.00.
* `else { ... }`: Se a condição anterior for falsa (ou seja, o número de minutos é maior que 100), o programa calcula o valor a pagar.
    * `double b = ((minutos - 100) * 2) + 50;`: Calcula o valor a pagar. Os minutos que excedem 100 são multiplicados por 2 (o custo por minuto extra), e o resultado é somado aos R$ 50.00 iniciais.
    * `JOptionPane.showMessageDialog(null,"Valor á pagar é: " + b);`: Exibe uma janela de diálogo com o valor total a ser pago.
