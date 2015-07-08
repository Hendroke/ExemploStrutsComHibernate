<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<!-- IMPORTANDO AS MODAIS -->
<%@include file="/pages/restrito/modais.jsp" %>

<br><br>
<form id="fab" method="post">
<!-- DATATABLE FABRICANTES -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">Consulta Fabricantes</div>
			<div class="panel-body">
				<div class="table-responsive">

					<table id="example"
						class="table table-striped table-bordered table-hover">

						<thead>
							<tr>
								<th>Nome</th>
								<th>Sobrenome</th>
								<th>Data de Fundação</th>
								<th>Slogan</th>
								<th>País Sede</th>
								<th>Excluir</th>
								<th>Editar</th>
							</tr>

						</thead>
						
							<tbody>
							
								<logic:iterate id="data" name="fabricanteForm" property="fabricantes">
									<tr class="odd gradeX">
										
										<td><bean:write name="data" property="nome" /></td>
										<td><bean:write name="data" property="sobrenome" /></td>
										<td><bean:write name="data" property="dataFundacao" /></td>
										<td><bean:write name="data" property="slogan" /></td>
										<td><bean:write name="data" property="paisSede" /></td>
										<td><button value="Excluir" onclick="excluir( <bean:write name="data" property="id" /> );">EXCLUIR</button></td>
										<td><button value="Editar" onclick="editar( <bean:write name="data" property="id" /> );">EDITAR</button></td>
									</tr>
								</logic:iterate>
							
							</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
</form>


<script>
function editar(id) {
	document.forms[1].action = 'fabricanteAction.do?method=popular&id='+id;
	document.forms[1].submit();
}

function excluir(id) {
	document.forms[1].action = 'fabricanteAction.do?method=excluir&id='+id;
	document.forms[1].submit();
}

	$(document).ready(function() {
		$('#example').dataTable();
	});
</script>

