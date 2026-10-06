# Sistema de Criação de Personagens de RPG
Este projeto consiste em uma aplicação de console desenvolvida em Java (JDK 25) focada na criação e gerenciamento de personagens de RPG. O objetivo principal do projeto é aplicar de forma prática os fundamentos da Programação Orientada a Objetos (POO), garantindo validação rigorosa de dados de entrada, encapsulamento e tratamento defensivo de exceções.

# Recursos e Funcionalidades
Menu Interativo via Terminal: Navegação simples para cadastro e visualização de personagens.

Validação Robustecida de Dados: Interceptação e tratamento de erros de digitação (como textos vazios ou valores numéricos fora do intervalo) sem interrupção do programa.

Gerenciamento de Grupo: Suporte à criação de múltiplas instâncias de personagens e execução de habilidades especiais personalizadas.

# Arquitetura e Conceitos de POO Aplicados

1 O sistema foi estruturado em 6 componentes para atender ao requisito mínimo de classes e divisão de responsabilidades:

2 ClassePersona (Enum): Define os tipos de classe suportados no jogo (Guerreiro e Mago).

3 Personagem (Classe Abstrata Base): Implementa o encapsulamento dos atributos gerais (nome, nível, pontos de vida, classe) e declara o contrato para o método abstrato executarHabilidadeEspecial().

4 Guerreiro (Subclasse): Herda de Personagem e adiciona o atributo específico de força física, sobrescrevendo a habilidade especial.

5 Mago (Subclasse): Herda de Personagem e adiciona o atributo específico de pontos de mana, sobrescrevendo a habilidade especial.

6 InputValidator (Serviço Utilitário): Isola a lógica de leitura do Scanner, tratando exceções como NumberFormatException para garantir que o fluxo de entrada do usuário seja válido.

7 Main (Controlador/Interface): Gerencia o ciclo de vida da aplicação, os menus do terminal e a coleção polimórfica de personagens.

# Pilares Utilizados
Encapsulamento: Atributos mantidos como private, acessados e modificados via métodos getters e setters que contêm regras de validação interna.

Herança: Reuso dos atributos e comportamentos comuns da classe abstrata Personagem pelas subclasses Guerreiro e Mago.

Polimorfismo: Tratamento unificado de objetos do tipo Personagem dentro da lista do grupo, invocando dinamicamente as implementações específicas de executarHabilidadeEspecial() e exibeFicha().

# Requisitos do Sistema
JDK (Java Development Kit): Versão 25 ou superior.

# Estrutura do Projeto

src/
├── ClassePersona.java
├── Personagem.java
├── Guerreiro.java
├── Mago.java
├── InputValidator.java
└── Main.java

# Instruções de Compilação e Execução
1 Abra o terminal ou prompt de comando no diretório onde os arquivos .java estão salvos.
2 Compile todas as classes utilizando o compilador Java

# Bash
javac *.java
java Main
