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

### Visualização do custo da energia consumida.
**Descrição:** \
Na página principal será mostrado ao utilizador os diversos custos que o utilizador teve, bem como o eletrodoméstico correspondente.

**Pré-condições:**
- O utilizador tem eletrodomesticos e consumos registados.

**Passo a passo:**
1. Executar a aplicação.   
2. Entrar na pagina do utilizador.
3. Se não houverem eletrodomesticos registados, o utilizador terá de registar novos eletrodomésticos.
4. O utilizador introduz os consumos dos respetivos eletrodomésticos, se ainda não houverem valores.
5. Uma vez introduzidos os dados, estes serão registados na base de dados.
6. Serão apresentados na homepage do utilizador os consumos dos eletrodomesticos.

**Pós-condições:**
- Comunicação correta com a base de dados.

### Adição e remoção de eletrodomésticos
**Descrição:** \
Adicionar ou remover eletrodomésticos

**Pré-condições:**
- Comunicação correta com a base de dados.

**Passo a passo:**
1. Na pagina dos eletrodomesticos, será apresentado ao utilizador a opção de alterar os seus eletromoésticos através de dois botoes.
2. Uma vez carregado, o utilizador será levado para uma página em que vai visualizar todos os eletrodomésticos que possui.
3. No canto superior direito da página serão apresentados dois botões, em que um dá a opção do utilizador remover um eletrodoméstico e outro para adicionar um eletrodoméstico, neste caso o utilizador vai ter de colocar os dados respetivos ao eletrodoméstico para o adicionar com sucesso.
4. Se o utilizador não quiser fazer nenhuma destas opções ser-lhe-á dada a opção de voltar atrás através dum botão localizado no canto inferior direito da página.

**Pós-condições:**
N/A

### Adicionar um novo consumo.
**Descrição:** \
O utilizador poderá adicionar um novo consumo de uma nova semana.

**Pré-condições:**
N/A

**Passo a passo:**
1. Na homepage do utilizador será apresentado um botão no canto superior direito em que se o utilizador o carregar será levado para uma nova página.
2. Nesta página, o utilizador vai indicar o eletrodomésticos que esteve ligado e o respetivo tempo que esteve ligado.
3. Com estes dados, o programa vai fazer os calculos para saber a quantidade de energia elétrica consumida naquela semana.


**Pós-condições:**
-Comunicação com a base de dados

### Calculo do custo
**Descrição:** O utilizador estabelece um objetivo para o seu custo elétrico.

**Pré-condições:**
O utilizador escreve corretamente o nome do mes.

**Passo a passo:**
1. Na pagina do custo será apresentado ao utilizador um botão do lado superior direito, que uma vez carregado levara o utilizador para uma pagina onde pode escolher o mes que vai introduzir o consumo.
2. O utilizador escreve o nome do mes em ingles do qual pertende que o programa calcule o seu custo.
3. O custo sera depois apresentado na pagina dos Custos.

**Pós-condições:**
- Comunicação com a base de dados.


## Referências:
[1]EDP. Acedido em: 31/10/2020 URL:https://www.edp.pt/particulares/
