<!-- IMPORTANDO AS MODAIS -->
<%@include file="/pages/restrito/modais.jsp" %>


<br><br>
Bem vindo Admin! Vamos ver o que aconteceu at� aqui...
<br><br>
O projeto inicia o arquivo index.jsp. Nele estamos inserindo o arquivo template.jsp. 
Dentro do arquivo template temos v�rios " tiles:insert attribute="xxx" ". No index, al�m 
de estarmos inserindo o template para visualiza��o, estamos preenchendo esses inserts dele 
com os tiles:put do index. Ou seja, aonde est� tiles:insert attribute="body" no template, 
ser� inchertado todo o c�digo do arquivo "/pages/tiles/welcome.jsp", pois no index est� 
tiles:put name="body" value="/pages/welcome.jsp". O arquivo welcome.jsp cont�m a tela de 
login com os campos para fazer login.
<br><br>
Quando clicamos em entrar, o formul�rio de dados chama a action com path="/Login" no arquivo struts-config.xml, que da um request 
na classe "com.struts_exemplo.view.login.LoginAction" passando o formul�rio q estava no welcome e o 
mapeamento da pr�pria action, ou seja, os forwards. Assim ele instancia um LoginForm com um cast do 
parametro form que preenche automaticamente com sets as variaveis da classe. Faz as compara��es e 
usa o mapeamento da action para retornar qual forward deve ser implementado, o failure ou o abrir_body.<br>
O forward abrir_body executa o path=".bodyTiles" no arquivo tiles-defs.xml que modifica o template colocando 
agora no lugar no body o arquivo "/pages/restrito/bodyInterno.jsp", aonde estou escrevendo toda essa explica��o, 
e no lugar do menu o arquivo "/pages/restrito/menuInterno.jsp", aonde coloquei tamb�m aquele textinho centralizado no topo.
<br>
Quando clicamos no fabricante do cadastrar, a tag a possui o "data-toggle" q funciona como um nome para a implementa��o 
do "data-target". Quando clicamos num button com "data-dismiss" igual ao "data-toggle" � "desfeito" o data-target.
O data-target � o q faz manusear a div de id modalFabricante importada com o "%@include file="/pages/restrito/modais.jsp" %" neste
jsp e no fabricantes.jsp.
<br><br>
Este e o padr�o de Gerencia do Sistema de Crud de Fabricantes! =)


