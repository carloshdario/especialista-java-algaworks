# 🎯 Desafio Validar E-mail 📧

Este projeto tem como objetivo validar e-mails de acordo com um conjunto de regras específicas. Ele verifica se um endereço de e-mail está em conformidade com as regras de formato, como nome de usuário, domínio e sufixo. ✅

## 🛠️ Requisitos

- Java 17 ou superior ☕
- IDE como IntelliJ ou Eclipse (opcional) 💻

## 📝 Regras de Validação

1. **Nome de usuário** 🧑‍💻:
   - Pode conter letras, números, `-`, `_`, e `.`.
   - Não pode estar vazio.
   
2. **Domínio** 🌐:
   - O domínio deve ser composto por letras minúsculas, números, `-`, `.`.
   - Não pode ser vazio.
   
3. **Sufixo do domínio** 📍:
   - O sufixo deve ter entre 2 e 3 caracteres.
   - Somente letras minúsculas são permitidas.

4. **Regras gerais** 📋:
   - O e-mail deve conter apenas um `@` e um `.`.
   - O e-mail não pode ter espaços antes ou depois dos componentes.
   - O domínio não pode ter um `.` logo no início ou no final.
   - Não são permitidos caracteres especiais como `#` ou `!`.

## 📂 Estrutura do Projeto

- **ValidadorEmail.java**: Contém a lógica para validar os e-mails. ⚙️
- **Principal.java**: Realiza os testes, verificando se o validador está funcionando corretamente. 🔍


