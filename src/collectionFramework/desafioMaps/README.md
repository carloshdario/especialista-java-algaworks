# Desafio de Mapas - Cadastro de Capitais

## Descrição
Neste desafio, o objetivo foi explorar o uso de diferentes implementações de `Map` no Java, comparando suas características e comportamentos em relação à performance e à ordem dos elementos. O programa realiza o cadastro de estados e suas respectivas capitais, utilizando as implementações `HashMap`, `LinkedHashMap` e `TreeMap`.

## Estrutura do Projeto

O código está dividido em três classes principais:

### 1. **Classe Estado**
Representa um estado com as propriedades:
- **Sigla**: A sigla do estado (ex: "MG", "SP").
- **Nome**: O nome completo do estado (ex: "Minas Gerais", "São Paulo").

A classe implementa `Comparable<Estado>`, permitindo a comparação dos estados com base no nome.

### 2. **Classe Cidade**
Representa uma cidade com as propriedades:
- **Código IBGE**: Código de identificação da cidade.
- **Nome**: O nome da cidade (ex: "São Paulo", "Belo Horizonte").
- **Total Habitantes**: A quantidade de habitantes da cidade.

A classe implementa `Comparable<Cidade>`, permitindo a comparação das cidades com base no nome.

### 3. **Classe Principal**
A classe principal onde o programa é executado. Ela realiza:
- Criação dos objetos `Estado` e `Cidade`.
- Demonstração do uso de diferentes tipos de `Map`: `HashMap`, `LinkedHashMap` e `TreeMap`.

## Tipos de Map Comparados

1. **`HashMap`**:
   - Não garante a ordem de inserção das chaves.
   - Ideal quando a ordem não é importante, mas a performance nas operações de busca, inserção e remoção é essencial.
     
   **Exemplo de Uso**:
   ```java
   Map<Estado, Cidade> capitais = new HashMap<>();
   
2. **`LinkedHashMap`**:
   - Garante a ordem de inserção das chaves.
   - Útil quando é importante manter a ordem de inserção sem perder muito em performance.
   - Quando as inserções e iterações devem ser feitas na ordem em que as chaves foram adicionadas, o LinkedHashMap é a melhor escolha.
   
   **Exemplo de Uso**:
   ```java
   Map<Estado, Cidade> capitais = new LinkedHashMap<>();

 3. **`TreeMap`**:
   - Garante a ordem das chaves de acordo com a ordem natural ou um comparador personalizado.
   - Ideal quando se precisa que as chaves estejam ordenadas de maneira específica, como por ordem alfabética ou numérica.
   - A ordem das chaves é mantida durante as operações de inserção, atualização e remoção.

   **Exemplo de Uso**:
   ```java
   Map<Estado, Cidade> capitais = new TreeMap<>();
