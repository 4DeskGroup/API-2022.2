<br id="inicio">

<h1 align="center">API 2° Semestre de 2022 - 4Desk Group e Track Cash 💼</h1>

 <p align="center">
     <a href="#sobre">Sobre</a> • 
     <a href="#status">Status</a> •
     <a href="#techtools">Ferramentas e Tecnologias</a> • 
     <a href="#backlog">Backlog</a> •
     <a href="#estrutura-pastas">Estruturação das Pastas</a> • 
     <a href="#entregas">Entregas</a> • 
     <a href="#equipe">Equipe</a> 
</p>

<span id="sobre">

### 📋 Sobre o projeto:
<p>A Track Cash vem pro mercado e-commerce em estratégias financeiras, afim de conciliar o seu negócio com uma interface intuitiva e totalmente automatizada, e através de melhorias tem como o objetivo de otimizar o tempo dos clientes para priorizar a experiência de usabilidade do usuário.</p>
<p>O processo dessas melhorias é a integração de registros de canais de vendas; em lojas físicas ou online; com o cliente que quer acessar a plataforma, afim de interagir as informações de vendas desses canais.</p>
<p>Vários fatores dessa integração tem a sua sugestão de cadastrar, autorizar os meios de segurança, configurar e acessar os canais junto com a plataforma, e com a responsabilidade de salvar as informações de registros de canais ativos com a facilidade de acesso as vendas que o cliente está percorrendo, ou seja, um controle de vendas automatizado com a plataforma.</p>
 
<a href="#inicio">[Voltar ao início]</a>

 
 <span id="status">

 ### :bookmark_tabs: Status do projeto:  Em andamento. :construction:	
  
 <a href="#inicio">[Voltar ao início]</a>

<span id="techtools">
 
 ### :hammer_and_wrench: Ferramentas e Tecnologias
 
 <p align="center">
    <img src="https://img.shields.io/badge/Slack-292A2D?style=for-the-badge&logo=slack&logoColor=54C5CE"/> 
    <img src="https://img.shields.io/badge/Discord-292A2D?style=for-the-badge&logo=discord&logoColor=54C5CE"/> 
    <img src="https://img.shields.io/badge/Trello-292A2D?style=for-the-badge&logo=trello&logoColor=54C5CE"/> 
    <img src="https://img.shields.io/badge/Figma-292A2D?style=for-the-badge&logo=figma&logoColor=54C5CE"/> 
    <br>
    <img src="https://img.shields.io/badge/Java-292A2D?style=for-the-badge&logo=java&logoColor=54C5CE" />
    <img src="https://img.shields.io/badge/NetBeans-292A2D?style=for-the-badge&logo=netbeans&logoColor=54C5CE"/> 
    <img src="https://img.shields.io/badge/MySQL-292A2D?style=for-the-badge&logo=mysql&logoColor=54C5CE"/>
</p>
  
<a href="#inicio">[Voltar ao início]</a>
  
<span id="backlog"> 

### :bar_chart: Backlog
 
#### Backlog do Produto
 
##### Requisitos Funcionais
 Sprint | Requisitos | Prioridade | Status 
--------|------------|------------|--------
1 |	Possibilidade de o administrador cadastrar canais |	Alta |	OK
1	| Possibilidade de o usuário comum configurar canais |	Alta	| OK
2	| Usuário comum configurar canal através de automatização de configurações pré-cadastradas	| Média	|	OK		
2	| Administrador ter acesso à uma tabela listando canais cadastrados por usuário comum. |	Alta	|	OK		
2	| Usuário comum poder alterar ou excluir configurações de um canal. |	Alta |	OK		
2	| Usuário utilizar de mecanismo de busca para canais configurados por ele.	| Média |	OK			
3	| Usuários são autenticados ao realizarem o login no sistema	| Alta |	OK			
3	| Cadastro prévio de usuário e seu tipo feito pelo desenvolvedor	| Alta |	OK
3	| Usuário comum é filtrado na interface de login, tendo acesso apenas ao que ele deve ter. |	Alta |	OK	
3	| Administrador é filtrado na interface de login, tendo acesso apenas ao que ele deve ter. |	Alta |	OK
4	| Administrador tem acesso a um sistema integrado e completamente funcional.	| Alta |	:black_square_button:		
4 |	Usuário comum tem acesso a um sistema integrado e completamente funcional.|	Alta |	:black_square_button:			


##### Requisitos Não Funcionais
 Sprint | Requisitos | Prioridade | Status 
--------|------------|------------|--------
1	| Desenvolver banco de dados para registrar informações inseridas no sistema	| Alta |	OK
1 |	Utilizar linguagem Java	| Alta	| OK
1	| Desenvolver interfaces (front-end) |	Alta	| OK
1	| Funcionalidade básica das interfaces desenvolvidas (Cadastro e Configurações de canais)	| Alta |	OK
1	| Conexão do front-end com o back-end (Banco de dados receber e transmitir dados juntamente ao software em desenvolvimento) |	Alta |	OK
2	| Automatização da interface de Configurações de canais (token ou usuário/senha aparecer de acordo com item selecionado no combobox) |	Média |	OK	
2	| Funcionalidade completa da interface Configurações de canais	| Média |	OK
2	| Conexão da interface de Configurações de canais com o banco de dados |	Alta	|	OK
2	| CRUD do usuário	| Alta |	OK
2	| Sistema de busca de canais configurados na interface de Configurações ativas	| Baixa	|	OK
3	| Cadastrar previamente os usuários no sistema	| Alta |		OK
3	| Sistema de autenticação de login	| Alta	|	OK
3	| Sistema de distinção de tipos de usuário	| Média |	OK
3	| Definir quais interações cada tipo de usuário tem permissão de realizar	| Média |	OK
3	| Menu de acesso às interfaces desenvolvidas |	Baixa | OK
3	| Exibição de todos os canais e usuários contidos registrados para o usuário administrador	| Baixa | OK		
3	| Sistema de paginação na lista de exibição de canais cadastrados pelo usuário	| Baixa	|	OK
4	| Revisão e correção de possíveis bugs	| Alta |	:black_square_button:	
4	| Possível melhorias no funcionamento do sistema	| Baixa | :black_square_button:			

##### Timeline
<div align='center'>
    <img src='https://github.com/4DeskGroup/API-2022.2/blob/main/doc/geral/timeline%20geral.png' width='60%' height='50%'>
</div>
 
<a href="#inicio">[Voltar ao início]</a> 
 
<span id="estrutura-pastas">
 
### :clipboard: Estruturação das pastas
```bash
├───doc
│   ├───geral
│   ├───sprint 1
│   │   ├───backlog
│   │   ├───burndown
│   │   ├───database
│   │   ├───gifs
│   │   ├───timeline
│   │   ├───user stories
│   │   ├───wireframe
│   ├───sprint 2
│   │   ├───backlog
│   │   ├───burndown
│   │   ├───database
│   │   ├───gifs
│   │   ├───timeline
│   │   ├───user stories
│   │   ├───wireframe
│   ├───sprint 3
│       ├───backlog
│       ├───burndown
│       ├───database
│       ├───gifs
│       ├───timeline
│       ├───user stories
│       ├───wireframe
└───Api_TrackCash
    ├───Banco de Dados
    └───Project4Desk
```
 
<a href="#inicio">[Voltar ao início]</a>
 
<span id="entregas">

### :dart: Entregas

Sprint ID | Data | Tag | Vídeo | Status
----------|------|-----|-------|--------
#1 | 29.08.2022 - 18.09.2022 | <a href="https://github.com/4DeskGroup/API-2022.2/releases/tag/%23Sprint1">Aqui</a> | :stop_sign: | :heavy_check_mark:
#2 | 19.09.2022 - 09.10.2022 | <a href="https://github.com/4DeskGroup/API-2022.2/releases/tag/%23Sprint2">Aqui</a> | :stop_sign: | :heavy_check_mark:
#3 | 17.10.2022 - 06.11.2022 | <a href="https://github.com/4DeskGroup/API-2022.2/releases/tag/%23Sprint3">Aqui</a> | :stop_sign:  | :heavy_check_mark: 
#4 | 07.11.2022 - 27.11.2022 | :construction: | :construction: | :black_square_button:

 
<a href="#inicio">[Voltar ao início]</a>

<span id="equipe">

### :busts_in_silhouette: Equipe:
Função | Nome | GitHub & LinkedIn
-------|------|-------------------
Scrum Master | Stefanie Heinrich| [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/ste-fa-nie)
Product Owner | Carlos Berghahn | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/CarlosKB) [<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=54C5CE&color=292A2D" />](https://www.linkedin.com/in/carlos-kau%C3%A3-berg-56164b250)
Dev Team | Diane Moreno | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/Diane-Moreno) [<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=54C5CE&color=292A2D" />](https://www.linkedin.com/in/diane-alves-38b6761ba/)
Dev Team | Laiza Truyts | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/LaizaCristina) [<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=54C5CE&color=292A2D" />](https://www.linkedin.com/in/laiza-cristina-machado-zaic-truyts-42a695231/)
Dev Team | Pedro Farias | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/Sunan16) [<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=54C5CE&color=292A2D" />](https://www.linkedin.com/in/pedro-sunandev/)
Dev Team | Raynara dos Santos | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/raynaranasc)
Dev Team | Rodrigo de Andrade | [<img src="https://img.shields.io/badge/github%20-%23121011.svg?&style=for-the-badge&logo=github&logoColor=54C5CE&color=292A2D"/>](https://github.com/RodrigodeAndrade90) [<img src="https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=54C5CE&color=292A2D" />](https://www.linkedin.com/in/rodrigo-de-andrade-a34605104/)
 

> Instituição: Fatec São José dos Campos - Prof. Jessen Vidal
> 
> Curso: Análise e Desenvolvimento de Sistemas / 2º Semestre
 
<a href="#inicio">[Voltar ao início]</a>
