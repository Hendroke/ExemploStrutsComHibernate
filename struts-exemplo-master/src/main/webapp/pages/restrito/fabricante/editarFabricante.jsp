<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<!-- IMPORTANDO AS MODAIS -->
<%@include file="/pages/restrito/modais.jsp" %>

<br><br>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Editar Fabricante
			</div>
			<div class="panel-body">
				<form id="editarFabricanteForm" method="post" class="form-horizontal" action="fabricanteAction.do?method=editar" focus="nome">
					<div class="form-group">
						<label class="col-md-4 control-label">Nome</label>
						<div class="col-md-5">
							<input type="text" class="form-control" name="nome" required="required" value="<bean:write name="fabricanteForm" property="nome" />" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">Sobrenome</label>
						<div class="col-md-5">
							<input type="text" class="form-control" name="sobrenome" required="required" value="<bean:write name="fabricanteForm" property="sobrenome" />" />
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="dataFundacao">Data de Fundação</label>
						<div class="col-md-4">
							<input id="dataFundacao" name="dataFundacao" type="text" placeholder="ex: 00/00/0000" class="form-control input-md" required="required" value="<bean:write name="fabricanteForm" property="dataFundacao" />">
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="slogan">Slogan</label>
							<div class="col-md-5">
							<input id="slogan" name="slogan" type="text" required="required" placeholder="" class="form-control input-md" value="<bean:write name="fabricanteForm" property="slogan" />">
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="paisSede">Pais Sede</label>
						<div class="col-md-5">
							<input id="paisSede" name="paisSede" type="text" placeholder="" class="form-control input-md" data-rule-required="true" value="<bean:write name="fabricanteForm" property="paisSede" />">
						</div>
					</div>
		
					<div class="form-group">
						<div class="col-md-6 col-md-offset-3">
							<button type="submit" class="btn btn-primary" onclick="editar()">Salvar alterações</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<script>
function editar() {
	document.forms[1].action = 'fabricanteAction.do?method=editar&id='+id;
	document.forms[1].submit();
}

$(document).ready(function() {
	$('#example').dataTable();
});
</script>

