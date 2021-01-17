# Manutenção de Recursos
Manutenção e gestão de recursos numa casa/infraestrutura

## Autores:

| Número | Nome |
|--------|------|
|  20190861  | João Rolo |
|  20190881  | Tomás Ferreira |

## Enquadramento

Os recursos do planeta terra são limitados e por isso temos de tentar aproveitar ao máximo os recursos que temos, sem os desperdiçar. Deste modo e, sendo sensíveis à problemática ambiental e às atuais alterações climáticas que assolam o nosso planeta, com gravissímas consequências para as presentes e futuras gerações, criámos uma aplicação que dá a possibilidade às pessoas de gerirem os seus consumos domésticos, em particular, os consumos relacionados com a energia elétrica.

Com efeito, a energia elétrica pode ser produzida de diversas formas, quer estas sejam a partir de recursos fósseis, tais como o carvão, ou a partir de recursos renováveis, como a energia eólica e hídrica. É o caso de Portugal, país particularmente dependente das energias renováveis, sendo estas as fontes energéticas predominantes no país. A maioria da população portuguesa não mostra interesse em saber a energia que gasta. Aprecie-se, por exemplo, a situação verificada em 2007, onde Portugal foi analisado,tendo-se concluído que o nosso país desperdiçava cerca de 60% da energia que consumia, quer esta seja através da má eficiência energética dos edifícos ou objetos ligados à corrente, como podemos ver neste artigo do jornal de negócios [https://www.jornaldenegocios.pt/empresas/detalhe/portugal_desperdica_60_da_energia_que_consome].

Uma vez que não podemos ajudar as pessoas a pouparem energia através do melhoramento da eficiência energética da sua casa, podemos ajudá-las através da nossa aplicação, dando-lhes uma ferramenta que podem usar com facilidade e de uma forma muito simples e intuitiva, com o objetivo de tornar mais eficiente o seu consumo energético em casa, dando-lhes uma forma de gerir e acompanhar o seu consumo energético através de gráficos e tabelas para a pessoa conseguir observar o que poderia melhorar de forma a ajudar a criar um país mais verde.
Para este trabalho se concretizar vamos recorrer a diversos sites, tais como a Iberdrola [https://www.iberdrola.pt/] e a EDP [https://www.edp.pt/particulares/], de forma a tentar ajudar o utilizador naquilo que pode melhorar no seu quotidiano de forma a melhorar tambem o seu consumo energético.


## Casos de utilização:

### Visualizacao do custo da energia consumida e da energia total consumida.
**Descrição:** \
Na página principal será mostrado ao utilizador o custo mensal da energia consumida, bem como a participação energética de cada eletrodoméstico.
Se o utilizador ainda nao possuir nenhum eletrodoméstico registado, ser-lhe-á pedido que registe pelo menos um eletrodoméstico.

**Pré-condições:**
- Utilizador entra com sucesso na sua pagina;
- Existe uma comunicação feita com sucesso com a base de dados;

**Passo a passo:**
1. Executar a aplicação.   
2. Entrar na pagina do utilizador.
3. Se não houverem eletrodomesticos registados, o utilizador terá de registar novos eletrodomesticos.
4. O utilizador introduz os consumos dos respetivos eletrodomesticos, se ainda não houverem valores.
5. Uma vez introduzidos os dados, estes serão registados na base de dados.
6. Serão apresentados na homepage do utilizador o consumo total dos eletrodomesticos e o custo do consumo elétrico.
7. O utilizador tambem poderá ordenar os eletrodomesticos por ordem crescente ou decrescente de consumo ou por ordem alfabetica quando estes são apresentados.

**Pós-condições:**
- Comunicação correta com a base de dados.

### Adição e remoção de eletrodomésticos
**Descrição:** \
Alterar ou remover eletrodomésticos

**Pré-condições:**
- Comunicação correta com a base de dados.

**Passo a passo:**
1. Na home page, será apresentado ao utilizador a opção de alterar os seus eletromoésticos através dum botão.
2. Uma vez carregado no botão, o utilizador será levado para uma página em vai vizualizar todos os eletrodomésticos que possui.
3. No canto superior direito dessa página serão apresentados dois botões, em que um dá a opção do utilizador remover um eletrodoméstico e outro para adicionar um eletrodomestico, neste caso o utilizador vai ter de colocar os dados respetivos ao eletromoéstico para o adicionar com sucesso.
4. Se o utilizador não quiser fazer nenhuma destas opções ser-lhe-á dada a opção de voltar a trás através dum botão localizado no canto inferior direito da página.

**Pós-condições:**
N/A

### Adicionar um novo consumo.
**Descrição:** \
O uttilizador poderá adicionar um novo consumo duma nova semana.

**Pré-condições:**
N/A

**Passo a passo:**
1. Na homepage do utilizador será apresentado um botão no canto superior direito, em que se o utilizador o carregador será velado para uma nova página.
2. Nesta página o utilizador vai indicar que eletrodomesticos estiveram ligados e o respetivo tempo que estiveram ligados.
3. Com estes dados o programa vai fazer os calculos para saber a quantidade de energia elétrica consumida naquela semana.


**Pós-condições:**
-Comunicação com a base de dados

### Estabelecimento de um objetivo
**Descrição:** O utilizador estabelece um objetivo para o seu custo elétrico.

**Pré-condições:**
N/A

**Passo a passo:**
1. Na home page, será apresentado ao utilizador um botão ao lado do seu custo elétrico, que perguntará ao utilizador se este quer estabelecer um objetivo para o quanto tenciona pagar ao mês no seu consumo elétrico. 
2. Uma vez carregado no botão, o utilizador será levado para uma página onde vai poder introduzir o valor em euros de quanto tenciona gastar.
3. O valor será guardado na base de dados e será mostrado ao utilizador qual a forma mais rápida de atingir esse valor, mostrando assim o eletrodomestico mais usado, incentivando o utilizador a tentar utilizá-lo menos.

**Pós-condições:**
- Comunicação com a base de dados.


## Referências:
[1]EDP. Acedido em: 31/10/2020 URL:https://www.edp.pt/particulares/
