# Contador com Validação de Parâmetros

Este projeto é um programa em Java que realiza uma contagem entre dois números informados pelo usuário. O programa também implementa uma exceção personalizada para validar os parâmetros fornecidos.

## Descrição
O programa solicita dois números inteiros ao usuário:
1. O **primeiro parâmetro** deve ser o valor inicial da contagem.
2. O **segundo parâmetro** deve ser o valor final da contagem.

Se o segundo número for menor que o primeiro, o programa lança uma exceção personalizada `ParametrosInvalidosException`, indicando que os parâmetros são inválidos.

## Estrutura do Código

### Arquivos
- **`Contador.java`**: Contém a lógica principal do programa.
- **`ParametrosInvalidosException.java`**: Implementa uma classe de exceção personalizada para validar os parâmetros.

### Classes e Métodos
1. **Classe `Contador`**:
   - Método `main`: Interage com o usuário e chama o método `contar`.
   - Método `contar`: Realiza a contagem entre os dois números, lançando a exceção personalizada se os parâmetros forem inválidos.

2. **Classe `ParametrosInvalidosException`**:
   - Extende a classe `Exception` e fornece uma mensagem personalizada.

## Exemplo de Uso

### Código de Exemplo
#### `Contador.java`
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int num2 = sc.nextInt();
        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new ParametrosInvalidosException(num1, num2);
        } else {
            int contador = num2 - num1;
            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
```

#### `ParametrosInvalidosException.java`
```java
public class ParametrosInvalidosException extends Exception {
    private int num1;
    private int num2;

    public ParametrosInvalidosException(int num1, int num2) {
        super();
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
}
```

### Exemplo de Entrada e Saída
#### Entrada
```
Digite o primeiro parâmetro: 
5
Digite o segundo parâmetro: 
10
```
#### Saída
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```
#### Entrada Inválida
```
Digite o primeiro parâmetro: 
10
Digite o segundo parâmetro: 
5
```
#### Saída
```
O segundo parâmetro deve ser maior que o primeiro
```

## Tecnologias Utilizadas
- **Linguagem**: Java

## Como Executar o Projeto
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Crie os arquivos `Contador.java` e `ParametrosInvalidosException.java` em um mesmo diretório.
3. Compile os arquivos com o comando:
   ```bash
   javac Contador.java ParametrosInvalidosException.java
   ```
4. Execute o programa com o comando:
   ```bash
   java Contador
   ```
5. Siga as instruções exibidas no terminal.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
