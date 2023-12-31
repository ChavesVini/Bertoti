# Repositório Bertoti - 11/08

## Trecho 1:

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

### Comentário:

Para um engenheiro de software, eles tem mais conhecimento acerca do tempo, e, consequentemente, sabe como administrar-lo melhor.
Em relação a escala, é importante também eles terem uma noção sobre o tamanho do projeto, assim, podem fazer o projeto com o máximo de eficiência em um tempo determinado.
Além disso, eles são encorajados a fazer decisões mais complexas, que trará resultados de alto risco, baseados em escalas e tempo desconhecido.

# 14/08

## Trecho 2:

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

### Comentário:

Um engenheiro de software não é somente ser um programador, que faz uma tarefa e acabou sua atividade por hoje. Ele tem que pensar em desenvolver de um modo que as modificações futuras e a manutenção não seje muito pesada para eles. Além de ter que se preocupar com o futuro do seu software.

## Exemplos de trade-offs:

Escolha de uso de uma IDE, escolha de linguagens e resolução de um problema com duas soluções.

3) Escolha outro exemplo e faça essa mesma atividade:

Linux e Windows.

| Requisitos não funcionais | Motivo |
| ------------------------  | ---------------------------|
|Comodidade x Versatilidade|As pessoas estão mais acostumadas a conviver com o Windows instalado no PC do que o Linux, mesmo o próprio sendo "open source" no qual dá pra mexer em praticamente tudo.|
|Simplicidade x Complexidade|Interface gráfica do Windows ser bem mais convidativa, sendo mais fácil de entender-la.|
|Privacidade x Exposição| O Linux é menos atacado por hackers justamente por ser uma OS menos conhecida do que o Windows, sendo menos propensa a ser atacada. Além dele ser muito mais privativo do que o próprio Windows, a maioria das distribuições Linux não coleta informações do usuário sem permissão.|

# 18/08

### Qual o requisito não funcional? 

Usabilidade.

### Qual a importância?

Experiência do usuário (UX).

### Como "obter" este requisito não funcional para o meu software?

Aplicando estas 10 heuristicas.

### Encontre 1 erro e 1 acerto de cada heuristica e coloque no seu README.md no GitHub.

#1 - Visibility of system status:
![1](https://github.com/ChavesVini/Bertoti/assets/126925449/a859b183-4e93-463c-865e-7253189869a5)

Windows no status "Iniciando...", você não sabe o que realmente está sendo iniciado.<br>
WhatsApp você sabe quando a pessoa está digitando, on-line e/ou gravando áudio.

#2 - Match between system and the real world:
![2](https://github.com/ChavesVini/Bertoti/assets/126925449/a54aafa7-647d-4d16-b4b4-15f8e925e675)

Erro 404 <br>
"Ops! Aconteceu um erro!"

#3 - User control and freedom:
![3](https://github.com/ChavesVini/Bertoti/assets/126925449/60abe474-87cf-48c8-aab6-008bcae7410a)

Windows quando o sistema trava, as únicas opções seriam tirar o computador da tomada ou desligar e religar manualmente.<br>
Android tem uma saída de emergência que seria a de reinicio rápido do celular, sendo útil em momentos onde todo o sistema trava e não dá para mexer em nada.

#4 - Consistency and standards:
![4](https://github.com/ChavesVini/Bertoti/assets/126925449/e412ccf4-f05b-4d97-917c-6742b7864840")

O site da Kabum não tem o icone de "lupa" que significa "pesquisar", que no consenso atual, você olha pra ela e já associa com pesquisa. No site tem um "Busque Aqui" gigante.

#5 - Error prevention:
![5](https://github.com/ChavesVini/Bertoti/assets/126925449/6ac1533a-e302-4f5f-8565-8b4fa51c6e8c)

Formatação de informações, como CPF ou número de telefone. Isso serve tanto pra exemplo bom quanto para exemplos ruins.

#6 - Recognition rather than recall:

![6](https://github.com/ChavesVini/Bertoti/assets/126925449/ddc39225-687a-4814-99ec-17aca0ee2dd3)

Filtros em que você tem que escrever ao invés de selecionar a opção desejada.

#7 - Flexibility and efficiency of use:
![7](https://github.com/ChavesVini/Bertoti/assets/126925449/ac8d23b6-22ae-4ad1-af2a-42c555d16b5a)

Acerto: Atalhos do teclado, como CTRL+Z, CTRL-C ou CTRL-V.<br>
Erro: Locais alternativos em mapas, mostrando o caminho mais demorado ao mais rápido, sendo que já é mostrado o mais rápido de primeira.

#8 - Aesthetic and minimalist design:
![4](https://github.com/ChavesVini/Bertoti/assets/126925449/de626026-d402-4c96-975f-7678bc9338a0)

Acerto: Google, somente com o nome do site e uma barra de pesquisa.<br>
Erro: Qualquer site de pesquisa de produtos, é sempre uma bagunça, com promoções e produtos estampados na "home" desses sites, poluindo visualmente.

#9 - Help users recognize, diagnose, and recover from errors:
![9](https://github.com/ChavesVini/Bertoti/assets/126925449/cb6340af-2e31-4c68-9712-7a58aefad4f4)

Acerto: "Não se pode renomear a pasta "Pictures" pois um arquivo ou pasta já tem esse nome."<br>
Erro: Tela azul do Windows

#10 - Help and documentation:
![10](https://github.com/ChavesVini/Bertoti/assets/126925449/822d3be9-0242-4dc0-a1a1-94d5f4707667)

Acerto: Steam. Na página inicial desse site, há a aba "suporte", criados para ajudar novos usuários a saber como utilizar.<br>
Erro: Sites de downloads de arquivos. Geralmente, muitas pessoas se sentem inseguras ao baixar algo na internet, e um tutorial ensinando a baixar, seria útil para essas pessoas.

# 21/08

# Ideia de implementação (diagrama): 
![diagram drawio](https://github.com/ChavesVini/Bertoti/assets/126925449/273c64a4-3272-4dca-9d3e-2b757c9ee418)

# UML
![UML-Bertoti](https://github.com/ChavesVini/Bertoti/assets/126925449/a733c049-ab25-41d7-9e9b-48c44bda0edf)
