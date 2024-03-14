// Call the dataTables jQuery plugin
$(document).ready(function() {

});


async function registrarUsuario(){

    let datos = {};

    datos.nombre = document.getElementById('txtNombre').value;
    datos.apellido = document.getElementById('txtApellido').value;
    datos.email = document.getElementById('txtEmail').value;
    datos.password = document.getElementById('txtPassword').value;

    let repetirpassword = document.getElementById('txtRepetirPassword').value;

    if(repetirpassword != datos.password){
        alert("la contraseña no coinciden");
        return
    }

    const request = await  fetch('api/usuarios',{
        method:'POST',
        headers:{
            'Accept': 'application/json',
            'Content-Type':'application/json'
        },
        body: JSON.stringify(datos)
    });



}


