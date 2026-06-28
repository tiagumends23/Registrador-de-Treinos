🏃‍♂️ Registrador de Treinos (Java)
Este projeto é uma aplicação de linha de comando desenvolvida em Java para o registro e monitoramento de atividades físicas, com foco em calcular o desempenho médio (pace) de corridas e treinos.

🚀 Funcionalidades
Registro Interativo: Cadastro de treinos via terminal utilizando Scanner.

Cálculos Automáticos: Cálculo de pace (minutos por km) baseado na duração e distância.

Persistência em Memória: Armazenamento dinâmico de múltiplos treinos durante a execução.

Relatório Final: Exibição organizada de todo o histórico de treinos registrados na sessão.

Boas Práticas: Utilização de java.time para manipulação precisa de datas e durações.

🛠️ Tecnologias Utilizadas
Java 17+ (ou superior)

API java.time (para manipulação de datas e períodos)

Collections API (ArrayList)

Git & GitHub para versionamento

📋 Como Executar
Certifique-se de ter o JDK instalado em sua máquina.

Clone este repositório:

Bash
git clone https://github.com/seu-usuario/seu-repositorio.git
Compile e execute o arquivo principal:

Bash
javac Principalnovo.java Treino.java
java Principalnovo
📈 Exemplo de Uso
Plaintext
--- Registro de Treino ---
Digite a distância (km): 6.0
Digite a duração (minutos): 25

Deseja registrar outro treino? (S/N): N

--- Relatório Final de Treinos ---
Treino do dia 2026-06-28: 6.0km em 25 minutos.
Pace: 4.17 min/km
💡 Aprendizados Técnicos
Durante o desenvolvimento, foram aplicados conceitos fundamentais de POO:

Encapsulamento de dados.

Tratamento de Recursos com try-with-resources.

Estruturas de Repetição para melhor experiência do usuário.

Interface e Polimorfismo básico com o método toString().
