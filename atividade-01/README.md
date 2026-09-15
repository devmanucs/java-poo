# Atividade 01 — Funcionário

Programa que lê os dados de um funcionário (nome, salário bruto e imposto), mostra o nome e o salário líquido, aplica um aumento percentual sobre o salário bruto e mostra os dados atualizados.

## Classe `Funcionario`

| Membro | Descrição |
|---|---|
| `nome : String` | Nome do funcionário |
| `salarioBruto : double` | Salário antes do imposto |
| `imposto : double` | Valor descontado do salário |
| `salarioLiquido() : double` | Retorna `salarioBruto - imposto` |
| `aumentarSalario(porcentagem : double) : void` | Aumenta o salário bruto pela porcentagem informada |

## Exemplo

```
Nome: Joao Silva
Salário bruto: 6000.00
Imposto: 1000.00

Funcionário: Joao Silva, R$ 5000.00

Qual a porcentagem de aumento do salário? 10.0

Dados atualizados: Joao Silva, R$ 5600.00
```

## Como executar

```bash
javac -encoding UTF-8 -d bin src/entidades/Funcionario.java src/aplicacao/Programa.java
java -cp bin aplicacao.Programa
```
