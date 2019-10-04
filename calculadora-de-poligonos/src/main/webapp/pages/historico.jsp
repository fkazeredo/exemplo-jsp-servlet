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
               <%@ page import ="java.util.Set" %>
               <%@ page import ="br.com.fkazeredo.services.domain.Poligono" %>
               <table class="table">
                 <thead>
                   <tr>
                     <th scope="col">Nome</th>
                     <th scope="col">Área</th>
                     <th scope="col">Arestas</th>
                   </tr>
                 </thead>
                    <c:forEach var="poligono" items="${poligonos}">
                           <tbody>
                               <tr>
                                   <td>${ poligono.getClass().simpleName }</td>
                                   <td>${ poligono.getArea() }</td>
                                   <td>${ poligono.getArestas() }</td>
                               </tr>
                           </tbody>
                    </c:forEach>
               </table>
           </div>
         </div>
       </div>

<%@ include file="../template/script.jsp"%>
</body>

</html>