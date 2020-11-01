# Manutenção de Recursos
Manutenção e gestão de recursos numa casa/infraestrutura

## Autores:

| Número | Nome |
|--------|------|
|  20190861  | João Rolo |
|  20190881  | Tomás Ferreira |

## Enquadramento

Hoje em dia o ser humano está muito dependente dos recursos envolventes para conseguir viver a sua vida quer que estes sejam renováveis ou não. 

Por causa disto, o ser humano tem de conseguir manter um controlo dos recursos que usa, uma vez que estes são finitos e podem ser prejudiciais para o meio ambiente.

Dito isto, a nossa aplicação visa ajudar o utilizador a ter controlo e conseguir gerir os seus consumos semanais, quer estes sejam gás, luz ou água. Como tal iremos usar o site da
EDP como recurso com vista a ajudar o utilizador.

## Casos de utilização:

### Introdução de Dados
**Descrição:** \
O utilizador introduz os dados sobre os seus consumos energéticos na aplicação e estes serão guardados pela mesma. 

**Pré-condições:**
- Utilizador efetua o login com sucesso.

**Passo a passo:**
1. Executar a aplicação.   
2. Fazer o login.
3. O utilizador seleciona a categoria em que pretende colocar os dados.
4. O utilizador introduz os dados.
5. Uma vez introduzidos os dados, o utilizador escolhe se quer guardar os dados ou alterar os mesmos depois de estarem guardados.
6.Os dados guardados podem ser apresentados na home page se o utilizador assim quiser.

**Pós-condições:**
- Comunicação correta com a base de dados.

### Visualização dos Dados através de um Gráfico.
**Descrição:** \
O utilizador poderá visualizar os dados num gráfico.

**Pré-condições:**
- Comunicação correta com a base de dados.

**Passo a passo:**
1. Na home page, o utilizador pode carregar num butão para acionar o gráfico.   
2. O gráfcio é apresentado ao utilizador numa nova janela.
3. O utilizador poderá escolher se pretende visualizar todas as componentes ou apenas uma. 

**Pós-condições:**
N/A

### Comparação de Dados.
**Descrição:** \
O utilizador poderá visualizar os consumos de duas semanas à escolha do mesmo.

**Pré-condições:**
- Acesso à base de dados.

**Passo a passo:**
1. O utilizador poderá carregar noutro butão na home page que vai abrir uma nova janela.
2. Nesta janela, outilizador poderá escolher as semanas acerca dos dados que vão ser apresentados.
3. Se o utilizador quiser visualizar outra semana poderá fazê-lo no menu.


**Pós-condições:**
N/A


## Referências:
[1]EDP. Acedido em: 31/10/2020 URL:https://www.edp.pt/particulares/
