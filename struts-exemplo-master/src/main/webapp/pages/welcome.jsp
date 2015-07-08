<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<div class="row">
	<div class="col-md-4 col-md-offset-4">
		<div class="login-panel panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Painel de Login</h3>
			</div>
			<div class="panel-body">
				<html:form action="/Login" focus="username">
					<fieldset>
						<div class="form-group">
							<input class="form-control" placeholder="Usuário" name="username" type="text" autofocus>
						</div>
						<div class="form-group">
							<input class="form-control" placeholder="Senha" name="password" type="password" value="">
						</div>
						<div class="checkbox">
							<label> <input name="remember" type="checkbox" value="Remember Me">Lembrar
							</label>
						</div>
						<!-- Change this to a button or input when using this as a form -->
						<button value="Login" class="btn btn-lg btn-success btn-block" type="submit">Entrar</button>
					</fieldset>
				</html:form>
			</div>
		</div>
	</div>
</div>