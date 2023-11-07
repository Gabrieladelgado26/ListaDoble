<%@include file="lib/header.jsp" %> 
<div class="container">
<% String message = (String) request.getAttribute("message");
    if (message != null) { %>
        <div class="alert alert-info" role="alert">
            <p>Mensaje: <%=message %></p>
        </div>
    <% } %>  
    <br><br>
    <h3>Lista de datos:</h3>
    <% String datosLista = (String) request.getAttribute("datosLista");
    if (datosLista != null) { 
    %>
         <div id=""lista" >
             <h3><%= datosLista %></h3>
         </div>
    <%            
    } else { %>
        <p>No hay datos que mostrar.</p>
    <% } %>

    <a class="btn btn-primary" href="index.jsp">Regresar al menú</a>
</div>
<%@include file="lib/footer.jsp" %> 
