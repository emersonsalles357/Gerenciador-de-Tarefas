# 📝 Gerenciador de Tarefas - Console Application

Um sistema simples e eficiente de gerenciamento de tarefas (To-Do List) desenvolvido em **Java** que roda diretamente no terminal. Este projeto foi criado com o objetivo de consolidar conceitos fundamentais de Programação Orientada a Objetos (POO) e manipulação de coleções em memória.

---

## 🚀 Funcionalidades

* **Adicionar Tarefas:** Permite cadastrar uma nova tarefa fornecendo título e descrição. O ID é gerado automaticamente e o status inicial é sempre pendente `[ ]`.
* **Listar Tarefas:** Exibe todas as tarefas cadastradas na memória, mostrando visualmente quais estão concluídas `[X]` ou pendentes `[ ]`.
* **Concluir Tarefas:** Altera o status de uma tarefa específica para concluída através do seu ID único.
* **Excluir Tarefas:** Remove permanentemente uma tarefa da lista utilizando o ID.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (Versão 17 ou superior)
* **IDE:** IntelliJ IDEA

---

## 🧠 Conceitos de POO e Java Aplicados

* **Encapsulamento:** Atributos protegidos por modificadores de acesso `private` e expostos de forma controlada apenas por métodos seletores (`getters`) e modificadores (`setters`).
* **Imutabilidade Controlada:** Proteção de dados sensíveis (como o `id` da tarefa) removendo métodos `setters` desnecessários para evitar alterações acidentais e garantir a consistência do sistema.
* **Coleções (Collections):** Utilização de `ArrayList` para o armazenamento dinâmico e manipulação dos objetos em memória.
* **Sobrescrita de Métodos (Override):** Customização do método `toString()` da classe mãe `Object` para formatar a exibição das tarefas diretamente no console de forma limpa.
* **Estruturas de Controle e Repetição:** Implementação de menus interativos com `while`, `switch-case`, e varredura de listas com `for-each`.

---

## 🔧 Como Executar o Projeto

1. Certifique-se de ter o **JDK 17 ou superior** instalado em sua máquina.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/emersonsalles353/Gerenciador-de-Tarefas.git](https://github.com/emersonsalles353/Gerenciador-de-Tarefas.git)
