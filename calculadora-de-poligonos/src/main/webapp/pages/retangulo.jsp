<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<%@ include file="../template/head.jsp"%>
<body>
    <%@ include file="../template/navbar.jsp"%>
       <div class="bd-example bd-example-tabs">
         <div class="row">
           <div class="col-3">
             <%@ include file="../template/sidebar.jsp"%>
           </div>
           <div class="col-9">
                <c:if test="${not empty titulo}">
                    <h1>${ titulo.descricao }</h1>
                </c:if>
                <hr/>
                <form action="calculadora" method="POST">
                  <input type="hidden" name="acao" id="acao" value="CalcularRetangulo" />
                  <div class="form-group">
                    <input type="text" class="form-control" id="base" name="base" placeholder="Base"/>
                  </div>
                  <div class="form-group">
                    <input type="text" class="form-control" id="altura" name="altura" placeholder="Altura"/>
                  </div>
                  <button type="submit" class="btn btn-primary">Calcular</button>
                </form>
                <c:if test="${not empty resposta}">
                    <h3>Área: ${ resposta.area }</h3>
                    <h3>Arestas: ${ resposta.arestas }</h3>
                </c:if>
           </div>
         </div>
       </div>

<%@ include file="../template/script.jsp"%>
</body>

</html>