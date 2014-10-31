$(document).on("ready", main);

function main() {
	$("body").append("<div id='previewSlideshow'>" +
		"<div id='imagen'>" +
			"<img src='' width='700' height='350' />" + 
				"<div id='descripcion'></div>" + 
				"<div id='cerrar'>Cerrar</div>" + 
				"</div></div>");
	$("#pictureGallery ul li").on("click", abrirImagen);
	$("#previewSlideshow #cerrar").on("click", cerrarImagen);
}

function abrirImagen() {
	alert('Yeah!');
	$("#previewSlideshow").fadeIn();
	var titulo = $("#j_idt8").attr('title');
	console.log(titulo);
	$("#previewSlideshow img").attr("src", "/primefaces/imagenes/" + titulo + "?pfdrid c=true");
	$("#previewSlideshow #descripcion").text($(this).attr("title"));
}

function cerrarImagen() {
	$("#previewSlideshow").fadeOut();
}