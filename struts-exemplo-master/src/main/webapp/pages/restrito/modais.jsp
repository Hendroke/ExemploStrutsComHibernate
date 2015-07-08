<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>





<div class="modal fade" id="modalFabricante" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Cadastro de Fabricantes</h4>
			</div>

			<div class="modal-body">
				<!-- The form is placed inside the body of modal -->
				<form id="fabricanteForm" method="post" class="form-horizontal" action="/struts-exemplo-master/fabricanteAction.do?method=salvar">


					<div class="form-group">
						<label class="col-md-4 control-label">Nome</label>
						<div class="col-md-5">
							<input type="text" class="form-control" name="nome" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-4 control-label">Sobrenome</label>
						<div class="col-md-5">
							<input type="text" class="form-control" name="sobrenome" required="required" />
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="dataFundacao">Data
							de Fundação</label>
						<div class="col-md-4">
							<input id="dataFundacao" name="dataFundacao" type="text"
								placeholder="ex: 00/00/0000" class="form-control input-md"
								required="required">
						</div>
					</div>
					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="slogan">Slogan</label>
						<div class="col-md-5">
							<input id="slogan" name="slogan" type="text" required="required"
								placeholder="" class="form-control input-md">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="paisSede">Pais
							Sede</label>
						<div class="col-md-5">
							<input id="paisSede" name="paisSede" type="text" placeholder=""
								class="form-control input-md" data-rule-required="true">
						</div>
					</div>


					<div class="form-group">
						<div class="col-md-6 col-md-offset-3">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Fechar</button>
							<button type="submit" class="btn btn-primary" onclick="salvar()">Salvar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<script>
	function salvar() {
		document.fabricanteForm.action = 'fabricanteAction.do?method=salvar';
		document.fabricanteForm.submit();
	}
	
	function editar() {
		document.fabricanteForm.action = 'fabricanteAction.do?method=editar';
		document.fabricanteForm.submit();
	}
</script>




