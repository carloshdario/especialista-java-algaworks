# Desafio de Mapas - Cadastro de Capitais

## Descrição
Neste desafio, o objetivo foi explorar o uso de diferentes implementações de `Map` no Java, comparando suas características e comportamentos em relação à performance e à ordem dos elementos. O programa realiza o cadastro de estados e suas respectivas capitais, utilizando as implementações `HashMap`, `LinkedHashMap` e `TreeMap`.

Cada implementação de `Map` tem suas particularidades:
- **`HashMap`**: Não garante a ordem das chaves.
- **`LinkedHashMap`**: Garante a ordem de inserção das chaves.
- **`TreeMap`**: Garante a ordem das chaves de acordo com a ordem natural ou com um comparador personalizado.

## Estrutura do Projeto

O código está dividido em algumas classes principais:

### 1. **Classe Estado**
Representa um estado com duas propriedades:
- **Sigla**: A sigla do estado (ex: "MG", "SP").
- **Nome**: O nome completo do estado (ex: "Minas Gerais", "São Paulo").

A classe implementa a interface `Comparable<Estado>`, permitindo a comparação dos estados com base no nome.

### 2. **Classe Cidade**
Representa uma cidade com três propriedades:
- **Código IBGE**: O código de identificação da cidade no Brasil.
- **Nome**: O nome da cidade (ex: "São Paulo", "Belo Horizonte").
- **Total Habitantes**: A quantidade de habitantes da cidade.

A classe implementa a interface `Comparable<Cidade>`, permitindo a comparação das cidades com base no nome.

### 3. **Classe Principal**
A classe principal onde o programa é executado. Ela realiza:
- Criação dos objetos `Estado` e `Cidade`.
- Demonstração do uso de diferentes tipos de `Map`: `HashMap`, `LinkedHashMap` e `TreeMap`.
- Comparação de comportamentos entre as implementações, principalmente em relação à ordem das chaves e à performance de inserção e recuperação.

## Tipos de Map Comparados

1. **`HashMap`**:
   - Não garante a ordem de inserção das chaves.
   - Ideal para quando a ordem não é importante, mas a performance nas operações de busca, inserção e remoção é essencial.
   
   **Exemplo de Uso**:
   ```java
   Map<Estado, Cidade> capitais = new HashMap<>();
