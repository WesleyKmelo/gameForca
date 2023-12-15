# Game Forca

Objetivo deste aplicativo é apresentar técnicas de consumo de api, bem como desacoplamento de classes e orientação ao Objeto em linguagem Java.

Este aplicativo é um jogo CLI *(Command Line Interface)*, onde toda dinâmica acontece no prompt ou Terminal.

**`O Objetivo deste jogo é adivinhar a palavra que foi sorteada aleatoriamente em menos de 7 tentativas erradas.`**

### Dinâmica do Jogo
* Uma palavra é selecionada em um site externo . 
* Essa palavra é codificada em asteríscos *(\*)*.
* Após uma orientação ao usuário , uma simulação de forca feita em *chars* é desenhada na tela;
* Solicitado ao usuário a inserção de uma letra;
* Feita verificação se a letra existe na palavra escolhida.
* Se a letra existir, sua posição é revelada na palavra codificada.
* Se não, é desenhada na tela uma parte que simula o corpo de um boneco.
* Só podem ser cometidos até 7 erros, pois no sétimo erro, o desenho do boneco é completado, o jogo acaba e a palavra é revelada.
* Se a palavra é adivinhada em menos de 7 tentativas é exibido uma mensagem de parabens.
* Ambos os casos é oferecida uma opção para repetir o jogo onde é sorteada outra palavra ou então sair .

### Tecnologia utilizadas
* Linguagem [Java](https://docs.oracle.com/en/java/);
* [Ubuntu 20.04 LTS](https://ubuntu.com/);
* [Vscode](https://code.visualstudio.com/download) com plugins @Microsoft [Extension Pack Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack);
* Biblioteca [GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson);
* Biblioteca [Jsoup](https://jsoup.org/download);

## Utilização 
Esse repositório é para fins didáticos , bem como os códigos aqui contidos são para estudos e porque não, auxílio para quem tiver precisando de uma inspiração.

Só peço que caso precise, deixa uma Star <img width="16" height="16" src="https://img.icons8.com/emoji/16/star-emoji.png" alt="star-emoji"/> e pode fazer um *fork* ou *clone*.
##
Então, pra utilização dos métodos aqui descritos é necessário baixar antes as bibliotecas do ***[Jsoup](https://jsoup.org/download)*** e do ***[GSON](https://mvnrepository.com/artifact/com.google.code.gson/gson)***.
* *Para utilização no VSCODE o arquivo .jar deve ser baixado em uma pasta qualquer do computador e depois importado na aba <strong>Referenced Libraries</strong> localizada na janela <strong>JAVA PROJECTS</strong> que tá na parte inferior da tela do Vscode .* 

<img src = "src/util/Captura de tela de 2023-12-15 15-40-33.png">

* *Para outras IDE's, é um procedimento bem mais fácil, bastando acrescentar no arquivo <strong>POM.XML</strong> as dependências necessárias, conforme instruções na página de download de cada biblioteca.* 

* No pacote ***util*** deste projeto existem duas classes que são responsáveis por buscar um palavra aleatória em um site especifico e retornar um *String* para o método que chamou de duas formas diferentes:
* A primeira forma é consumindo uma API. Nessa forma existem algumas maneiras de consumir. Aqui foi utilizado as formas mais genéricas
    * *O primeiro método faz uma consulta na API e o retorno dessa consulta deve ser moldado em uma classe especifica, contendo getters e setters com os mesmos atributos que vierem da api. Nesse caso é utilizado a biblioteca GSON.*
    * *O segundo método de consumir a API, tambem utilizando GSON, é criando o JSONOBJECT e nesse objeto passar o atributo necessário em forma de String não havendo a necessidade de criar uma classe. Isso foi útil aqui pq o código só precisa de um atributo.*
 

* A segunda forma foi fazendo uso da técnica de *[WebScrapping](https://pt.wikipedia.org/wiki/Coleta_de_dados_web)*. Para isso foi utilizado a biblioteca *JSOUP* que basicamente busca em um documento html , uma expressão que seja única e que retorne a String desejada.
***
Cabe lembrar que a técnica de *Webscrapping* nem sempre é segura pois ela se baseia em pesquisa por nomes e como os sites estão em constante evolução , pode ser que alguma hora o código possa quebrar.

No caso deste aplicativo , as técnicas aqui demonstradas são usados apenas para fins didáticos.

***
#### Download 
Para download deste projeto , utilizando o terminal ou prompt , localize a pasta de destino onde vc quer fazer doanload e se for usuário **Git** e tiver o *[GitCli](https://cli.github.com/)* instalado em sua máquina, basta digitar o comando 

`https://github.com/WesleyKmelo/gameForca.git`

Todo o código será baixado em sua máquina, menos as bibliotecas, que deverão ser baixadas à parte.

Deixo também meu Linkedin, caso alguem deseje entre em contato:

<a href="https://www.linkedin.com/in/wesley-camelo-silva/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>

Obs: Sugestões tambem podem ser enviadas. Pode criar um *issue* ou me chamar no Linkedin.
 

