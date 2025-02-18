![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
   start((Inicio)) --> input1[\Digite sua nota\]
   input1 --> input2[\Digite sua Frequência em %\]
   input2 ---> verification{Nota >=50 \n E \n frequencia >= 75% ?}
   verification ---> |Sim| ans1[\Aprovado\]
   verification ---> |Não| ans2[\Reprovado\]
   ans1 ---> final([Fim])
   ans2 ---> final([Fim])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
    start((inicio)) --> input[\Digite o primeiro número\]
    input ---> input2[\Digite o segundo número\]
    input2 ---> process[result = n1 + n2]
    process ---> result[/result/]
    result ---> fim([FIM])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
    start((begin)) --> input[\Digite o número\]
    input ---> verify{num >= 0?}
    verify ---> |sim| bigger[\o número é positivo\]
    verify ---> |não| smaller[\o número é negativo\]
    bigger ---> fim([FIM])
    smaller ---> fim
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
    start((inicio)) --> input[\digite sua idade\]
    input ---> verify{ idade >=16?}
    verify ---> |sim| bigger[\voce já pode votar!\]
    verify ---> |não| smaller[\você não pode votar :c\]
    bigger ---> fim([FIM])
    smaller ---> fim 
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((inicio)) --> input1[\insira o primeiro número\]
      input1 --> input2[\insira o segundo número\]
      input2 --> verify{n1 > n2?}
      verify --> |sim| resp1[\o primeiro número é maior\]
      verify --> |não| verify2{n1 = n2?}
      verify2 --> |sim| resp2[\os números são iguais\]
      verify2 --> |não| resp3[\os números não são iguais\]
      resp1--> fim([FIM])
      resp2 --> fim
      resp3 --> fim
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start((inicio)) --> input1[\Insira o primeiro numero\]
      input1 --> input2[\insira o segundo número\]
      
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      G["Sua resposta aqui!"]
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      H["Sua resposta aqui!"]
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      I["Sua resposta aqui!"]
   ```