<%@include file="lib/header.jsp" %> 

<div class="container">
    <div class="row">
        <div class="col-md-4 mx-auto">
            <div class="card card-body">
            <h3>Menu de opciones</h3>
                <form id="myForm" action="SvNodo" method="post" class="form-check">
                   <p>Selecciona una opcion:</p>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion1">1. Insertar nodo al inicio<br>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion2">2. Insertar nodo al final<br>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion3">3. Listar de inicio a fin<br>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion4">4. Listar de fin a incio<br>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion5">5. Eliminar un nodo del inicio<br>
                   <input class="form-check-input" type="radio" name="opcion" value="opcion6">6. Eliminar un nodo del Final<br>
                   <div id="inputValue" style="display: none;">
                       <label for="valor">Ingresa un valor:</label>
                       <input class="form-control" type="text" id="valor" name="dato"><br><br>
                   </div>
                   <input class="btn btn-success btn-block form-control" type="submit" value="Enviar">
                </form>
            </div>
        </div>
    </div>
</div>

<%@include file="lib/footer.jsp" %> 
