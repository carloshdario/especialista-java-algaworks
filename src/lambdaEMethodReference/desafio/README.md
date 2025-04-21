
# 💼 Desafio Java: Lambda Expressions e Method Reference

Este repositório contém uma sequência de implementações que demonstram o uso prático de **Lambda Expressions** e **Method References** na manipulação de uma lista de funcionários.

---

## 📌 Objetivo

Aplicar conceitos de programação funcional em Java para:

- Remover funcionários inativos da lista
- Ordenar funcionários por salário
- Imprimir informações de cada funcionário com cálculo de imposto

Cada classe (`Principal`, `Principal2`, `Principal3`) representa uma **etapa de evolução** no uso das expressões funcionais:

| Classe       | Estilo usado                  |
|--------------|-------------------------------|
| `Principal`  | Expressões lambda             |
| `Principal2` | Lambda + Method Reference     |
| `Principal3` | Apenas Method Reference       |

---

## 📁 Estrutura

```bash
lambdaEMethodReference/
└── desafio/
    ├── Funcionario.java
    ├── Principal.java     # Versão com Lambda Expressions
    ├── Principal2.java    # Versão com Lambdas e Method Reference
    └── Principal3.java    # Versão apenas com Method Reference
```

---

## 📚 Conceitos Aplicados

### 🔸 Lambda Expressions
Exemplo:
```java
Predicate<Funcionario> predicate = funcionario -> funcionario.isInativo();
```

### 🔸 Method Reference
Exemplo:
```java
Predicate<Funcionario> predicate = Funcionario::isInativo;
```

### 🔸 Interfaces Funcionais usadas
- `Predicate<T>` – para filtragem
- `Function<T, R>` – para extração de valores
- `Consumer<T>` – para ações sobre elementos
- `Comparator<T>` – para ordenação

---

## 🧾 Exemplo de saída no console

```
Funcionario: Maria, Salario R$5000, imposto: R$1000.00
Funcionario: Manoel, Salario R$13000, imposto: R$2600.00
Funcionario: João, Salario R$19000, imposto: R$3800.00
```

(Obs: Funcionário "Sebastião" foi removido por estar inativo)

---

## ▶️ Como executar

1. Compile os arquivos Java:
```bash
javac lambdaEMethodReference/desafio/*.java
```

2. Execute uma das versões:
```bash
java lambdaEMethodReference.desafio.Principal
# ou
java lambdaEMethodReference.desafio.Principal2
# ou
java lambdaEMethodReference.desafio.Principal3
```

---

## 🧠 Aprendizado passo a passo

- ✅ Entender a sintaxe básica de expressões lambda
- ✅ Usar interfaces funcionais da `java.util.function`
- ✅ Refatorar lambdas para method reference quando possível
- ✅ Tornar o código mais limpo e expressivo com programação funcional

---


