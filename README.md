# Sistema de Gerenciamento de Clínica Veterinária (Happy Pet)

Este é um projeto de console simples, desenvolvido em Java, para gerenciar os cadastros de uma clínica veterinária fictícia.

O principal objetivo deste projeto foi aplicar e solidificar os conceitos fundamentais de Programação Orientada a Objetos (POO).

---

O foco não foi criar uma aplicação complexa, mas sim demonstrar o entendimento dos seguintes pilares da POO:

- **Classes Abstratas e Herança:** A classe `Animal` é abstrata e serve como base para classes mais específicas como `Cachorro`, `Gato`, `Coelho` e `Cavalo`, que herdam seus atributos e métodos.
-  **Polimorfismo:** O método `mostrarDetalhes()` é abstrato em `Animal` e implementado de forma diferente em cada subclasse.
- **Encapsulamento:** Todos os atributos das classes são privados e acessados através de métodos `get` e `set`.
- **Composição:** A classe `Consulta` é composta por objetos das classes `Animal`, `Responsavel` e `Vet`.

---
