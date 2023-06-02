<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Usuário</title>
</head>
<body>
    <h1>Cadastro de Usuário</h1>

    <form action="cadastro" method="post">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome"><br> <br>

        <label for="dataNascimento">Data de Nascimento:</label>
        <input type="text" id="dataNascimento" name="dataNascimento"><br>
<br>
        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf"><br>
<br>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email"><br>
<br>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha"><br>
<br>
        <label for="curso">Curso:</label>
        <input type="text" id="curso" name="curso"><br>
<br>
        <label for="turno">Turno:</label>
        <input type="text" id="turno" name="turno"><br>
<br>
        <label for="matricula">Matrícula:</label>
        <input type="text" id="matricula" name="matricula"><br>
<br>
        <label for="empresa">Empresa:</label>
        <input type="text" id="empresa" name="empresa"><br>
<br>
        <label for="cargo">Cargo:</label>
        <input type="text" id="cargo" name="cargo"><br>
<br>
        <input type="submit" value="Cadastrar">
    </form>
</body>
</html>
