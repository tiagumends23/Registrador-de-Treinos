# 🏃‍♂️ Registrador de Treinos (Java)

Este projeto é uma aplicação de linha de comando desenvolvida em Java para o registro e monitoramento de atividades físicas, com foco em calcular o desempenho médio (**pace**) de corridas e treinos.

---

## 🚀 Funcionalidades

* **Registro Interativo:** Cadastro de treinos via terminal utilizando `Scanner`.
* **Cálculos Automáticos:** Cálculo de pace (minutos por km) baseado na duração e distância.
* **Persistência em Memória:** Armazenamento dinâmico de múltiplos treinos durante a execução.
* **Relatório Final:** Exibição organizada de todo o histórico de treinos registrados na sessão.
* **Boas Práticas:** Utilização de `java.time` para manipulação precisa de datas e durações.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **API `java.time**` (para manipulação de datas e períodos)
* **Collections API** (`ArrayList`)
* **Git & GitHub** para versionamento

---

## 📋 Como Executar

1. Certifique-se de ter o **JDK** instalado em sua máquina.
2. Clone este repositório:
```bash
git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)

```


3. Compile e execute os arquivos:
```bash
javac Principalnovo.java Treino.java
java Principalnovo

```



---

## 💡 Exemplo de Uso

```text
--- Registro de Treino ---
Digite a distância (km): 6.0
Digite a duração (minutos): 25

Deseja registrar outro treino? (S/N): N

--- Relatório Final de Treinos ---
Treino do dia 2026-06-28: 6.0km em 25 minutos.
Pace: 4.17 min/km

```

---

## 🎓 Aprendizados

Durante o desenvolvimento, apliquei conceitos fundamentais de POO:

* Encapsulamento de dados.
* Tratamento de recursos com `try-with-resources`.
* Estruturas de repetição para melhor experiência do usuário.

---
