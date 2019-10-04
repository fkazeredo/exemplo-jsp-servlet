<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
               <h1>Um erro ocorreu do lado do servidor</h1>
               <h3>500 - Internal Server Error</h3>
           </div>
         </div>
       </div>

<%@ include file="../template/script.jsp"%>
</body>

</html>