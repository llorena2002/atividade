package web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet ("/cadastro")
public class CadastroUsuarioServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.getRequestDispatcher("cadastro-usuario.jsp").forward(req, resp);
    	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os valores dos parâmetros do formulário
        String nome = request.getParameter("nome");
        String dataNascimento = request.getParameter("dataNascimento");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String curso = request.getParameter("curso");
        String turno = request.getParameter("turno");
        String matricula = request.getParameter("matricula");
        String empresa = request.getParameter("empresa");
        String cargo = request.getParameter("cargo");

        // Remove espaços em branco dos valores dos cookies
        nome = nome.trim();
        dataNascimento = dataNascimento.trim();
        cpf = cpf.trim();
        email = email.trim();
        senha = senha.trim();
        curso = curso.trim();
        turno = turno.trim();
        matricula = matricula.trim();
        empresa = empresa.trim();
        cargo = cargo.trim();

        // Configura os cookies com os valores obtidos
        Cookie cookieNome = new Cookie("nome", nome);
        Cookie cookieDataNascimento = new Cookie("dataNascimento", dataNascimento);
        Cookie cookieCpf = new Cookie("cpf", cpf);
        Cookie cookieEmail = new Cookie("email", email);
        Cookie cookieSenha = new Cookie("senha", senha);
        Cookie cookieCurso = new Cookie("curso", curso);
        Cookie cookieTurno = new Cookie("turno", turno);
        Cookie cookieMatricula = new Cookie("matricula", matricula);
        Cookie cookieEmpresa = new Cookie("empresa", empresa);
        Cookie cookieCargo = new Cookie("cargo", cargo);

        // Define a validade dos cookies (1 dia)
        cookieNome.setMaxAge(24 * 60 * 60);
        cookieDataNascimento.setMaxAge(24 * 60 * 60);
        cookieCpf.setMaxAge(24 * 60 * 60);
        cookieEmail.setMaxAge(24 * 60 * 60);
        cookieSenha.setMaxAge(24 * 60 * 60);
        cookieCurso.setMaxAge(24 * 60 * 60);
        cookieTurno.setMaxAge(24 * 60 * 60);
        cookieMatricula.setMaxAge(24 * 60 * 60);
        cookieEmpresa.setMaxAge(24 * 60 * 60);
        cookieCargo.setMaxAge(24 * 60 * 60);

        // Adiciona os cookies à resposta
        response.addCookie(cookieNome);
        response.addCookie(cookieDataNascimento);
        response.addCookie(cookieCpf);
        response.addCookie(cookieEmail);
        response.addCookie(cookieSenha);
        response.addCookie(cookieCurso);
        response.addCookie(cookieTurno);
        response.addCookie(cookieMatricula);
        response.addCookie(cookieEmpresa);
        response.addCookie(cookieCargo);

        // Redireciona para a página de exibição dos dados dos cookies
        response.sendRedirect("mostrar_dados.jsp");
    }
}
