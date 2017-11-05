<div class="tab-pane fade show" id="data">
    <div class="card-body">

        <p>Ejemplos de Manejo de data en Controllers. Ver clase <strong> DataController </strong></p>

        <ul class="list-group">
            <li class="list-group-item">
                <a href="/data/query?nombres=Tony_Stark" target="_blank"> Parámetros (nombre, apellidos) </a>
            </li>

            <li class="list-group-item">
                <a href="/data/group?nombres=Tony&apellidos=Stark&edad=30&sexo=M"  target="_blank"> Parámetros (nombre, apellidos, etc) </a>
            </li>

            <li class="list-group-item">
                <a href="/data/path/uno"  target="_blank"> Path Variable 1 </a>
            </li>

            <li class="list-group-item">
                <a href="/data/path/dos"  target="_blank"> Path Variable 2 </a>
            </li>
            <li class="list-group-item">
                <form action="/data/post" method="POST" target="_blank">
                    <input type="text" value="Tony" name="nombres"/>
                    <input type="text" value="Stark" name="apellidos"/>
                    <input type="submit" value="Enviar" />
                </form>
            </li>
        </ul>
    </div>
</div>