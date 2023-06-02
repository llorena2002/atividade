<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dados do Usuário</title>
</head>
<body>
    <h1>Dados do Usuário</h1>

    <h2>Informações Pessoais:</h2>
    <p>Nome: <%= getCookieValue(request, "nome") %></p>
    <p>Data de Nascimento: <%= getCookieValue(request, "dataNascimento") %></p>
    <p>CPF: <%= getCookieValue(request, "cpf") %></p>
    <p>Email: <%= getCookieValue(request, "email") %></p>
    <p>Senha: <%= getCookieValue(request, "senha") %></p>

    <h2>Informações Acadêmicas:</h2>
    <p>Curso: <%= getCookieValue(request, "curso") %></p>
    <p>Turno: <%= getCookieValue(request, "turno") %></p>
    <p>Matrícula: <%= getCookieValue(request, "matricula") %></p>

    <h2>Informações Profissionais:</h2>
    <p>Empresa: <%= getCookieValue(request, "empresa") %></p>
    <p>Cargo: <%= getCookieValue(request, "cargo") %></p>

    <%!
    private String getCookieValue(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
    %>
</body>
</html>
