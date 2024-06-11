## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Minha resolução
```mermaid
---
title: Iphone
---
classDiagram
   Iphone --> "1..*" ReprodutorMusical
   Iphone --> "1..*" NavegadorInternet
   Iphone --> "1" AparelhoEletronico
   ReprodutorMusical --> "1..*" Musica
    class ReprodutorMusical{
        - musica: Musica
        + tocarMusica()
        + pausarMusica()
        + selecionarMusica(Musica musica) 
    }
    class NavegadorInternet{
        - url: String
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }
    class AparelhoEletronico {
        + atender()
        + ligar(String numero)
        + iniciarCorreioDeVoz()
    }
    class Musica {
      - nome: String
      - artista: String
      + informacoesMusica() String
    }
    class Iphone {
       - aparelhoEletronico: AparelhoEletronico
       - navegadorInternet: NavegadorInternet
       - reprodutorMusical: ReprodutorMusical  
    }
    
```
