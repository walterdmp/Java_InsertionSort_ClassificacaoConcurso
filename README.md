# Candidatos a Concurso

Este projeto em Java carrega um arquivo CSV contendo dados de candidatos a um concurso, incluindo identificadores, nomes, datas de nascimento e notas. Os candidatos são classificados em ordem decrescente de notas, e, em caso de empate, a pessoa mais velha é melhor classificada.

## Tecnologias Utilizadas

- Java

## Estrutura do Projeto

- `Candidato`: Classe que representa um candidato e implementa a interface `Comparable` para ordenação.
- `Main`: Classe principal que carrega o arquivo CSV, realiza a ordenação e exibe os resultados.
- `dadosConcurso.csv`: Arquivo CSV com os dados dos candidatos.

## Algoritmo de Ordenação

A implementação da ordenação foi feita usando o algoritmo **Insertion Sort**. 
