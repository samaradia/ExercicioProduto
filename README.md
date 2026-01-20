# 📦 Projeto Produtos em Java

Projeto simples em Java desenvolvido para praticar conceitos básicos de **Programação Orientada a Objetos (POO)**.

---

## 🧠 Conceitos praticados

- Classes e objetos
- Encapsulamento (atributos privados, getters e setters)
- Construtores
- Herança (`extends`)
- Sobrescrita do método `toString()`
- Uso de `ArrayList`
- Laço `for-each`

---

## 🗂 Estrutura do projeto

- **Produto**
  - Classe base que representa um produto comum.

- **ProdutoPerecivel**
  - Classe que herda de `Produto` e adiciona a data de validade.

- **TestePrincipal**
  - Classe principal onde os objetos são criados e testados.

---

## 📌 Classe Produto

Representa um produto com:
- nome
- preço
- quantidade

Possui construtor, getters, setters e o método `toString()` para exibir os dados do produto.

---

## 📌 Classe ProdutoPerecivel

Herda da classe `Produto` e adiciona:
- data de validade

Utiliza o `super` para reaproveitar o construtor da classe pai.

---

## 📌 Classe TestePrincipal

- Cria uma lista de produtos usando `ArrayList`
- Adiciona produtos à lista
- Mostra o tamanho da lista
- Exibe os produtos usando `for-each`
- Testa a criação de um produto perecível

---

## ▶️ Exemplo de saída no console

```text
O tamanho da lista: 3
Primeira da lista: Garfo
Produto [nome = Garfo, preço=4.9,quantidade=7]
Produto [nome = Panela, preço=50.9,quantidade=3]
Produto [nome = Copo de vidro, preço=5.6,quantidade=9]
Produto [nome = Novo produto, preço=23.4,quantidade=5]
Produto [nome = Produto C, preço=12.75,quantidade=2]
