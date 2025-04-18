# 📚 Desafio de Listas - Cadastro de Pacotes de Viagem

Neste desafio, implementamos uma aplicação para **gerenciar pacotes de viagem** utilizando a classe `List` do Java. O sistema permite cadastrar pacotes de viagem, ordenar, remover, e buscar pacotes, com validações para garantir a integridade dos dados.

## 🔍 Descrição das Classes

### 1. `CadastroPacoteViagem.java`

A classe principal que gerencia a lista de pacotes de viagem. Possui métodos para:
- **Adicionar pacotes** com descrição e preço por pessoa.
- **Ordenar pacotes** por nome ou preço de forma crescente ou decrescente.
- **Buscar pacotes** por descrição.
- **Remover pacotes** por descrição.
- **Listar todos os pacotes** cadastrados.

A lista de pacotes é mantida em um `ArrayList` e métodos como `Collections.sort()` e `Iterator` são usados para ordenar e remover pacotes.

### 2. `PacoteViagem.java`

A classe `PacoteViagem` representa um pacote de viagem, com as seguintes propriedades:
- **Descrição** (String)
- **Preço por pessoa** (double)

A classe implementa a interface `Comparable`, permitindo que pacotes de viagem sejam comparados e ordenados com base na descrição.

### 3. `PacoteExistenteException.java`

Exceção personalizada lançada quando o usuário tenta adicionar um pacote que já existe na lista (mesmo nome de descrição).

### 4. `PacoteNaoRemovidoException.java`

Exceção personalizada lançada quando não é encontrado nenhum pacote com a descrição fornecida para remoção.

### 5. `PacoteNaoEncontradoException.java`

Exceção personalizada lançada quando não é encontrado nenhum pacote com a descrição fornecida para busca.

### 6. `Principal.java`

A classe de execução que simula o cadastro de pacotes de viagem, adiciona alguns pacotes, realiza operações de ordenação e remoção, e imprime a lista de pacotes.

## 🧑‍💻 Funcionalidades

- **Adicionar pacotes**: Um pacote pode ser adicionado com descrição e preço, garantindo que pacotes com o mesmo nome não sejam duplicados.
- **Ordenar pacotes**: A lista pode ser ordenada tanto por descrição quanto por preço.
- **Remover pacotes**: Pacotes podem ser removidos pela descrição, com verificação de que o pacote existe.
- **Buscar pacotes**: Permite buscar um pacote pela descrição.
- **Exceções personalizadas**: Caso o pacote já exista ou não seja encontrado, uma exceção personalizada é lançada.

## 🛠️ Conceitos Aplicados

- **Coleções em Java**: Uso de `ArrayList` para armazenar os pacotes e `Collections.sort` para ordenar.
- **Exceções personalizadas**: Lançamento e captura de exceções específicas para garantir a integridade dos dados.
- **Interface Comparable**: Implementação da interface `Comparable` para ordenar pacotes por nome.
- **Iterator**: Utilização de `Iterator` para percorrer a lista e remover pacotes de forma segura.

## 📦 Como Executar

1. Clone o repositório para sua máquina local.
2. Compile e execute a classe `Principal.java` para simular o cadastro e a manipulação dos pacotes de viagem.
3. Para testar as exceções, tente adicionar pacotes duplicados ou remover pacotes inexistentes.

---

### Exemplo de Execução

```bash
$ javac CadastroPacoteViagem.java PacoteViagem.java Principal.java
$ java Principal
