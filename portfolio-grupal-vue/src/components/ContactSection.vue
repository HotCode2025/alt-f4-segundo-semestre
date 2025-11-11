<template>
  <section id="contacto" class="seccion">
    <h2 class="titulo-seccion">Contacto</h2>
    <div class="formulario-contacto">
      <iframe 
        src="https://docs.google.com/forms/d/e/1FAIpQLSdAhgNFJxFXb5Q1n6o4H-OOB_D4BHeUZFx4io3X7sijYu334Q/viewform?embedded=true" 
        width="100%" 
        height="800" 
        frameborder="0" 
        marginheight="0" 
        marginwidth="0">
        Cargando…
      </iframe>
    </div>
  </section>
</template>

<style scoped>
.seccion {
  padding: 5rem 0;
  max-width: 1200px;
  margin: 0 auto;
  padding-left: 2rem;
  padding-right: 2rem;
}

.titulo-seccion {
  text-align: center;
  font-size: 3rem;
  margin-bottom: 3rem;
  background: linear-gradient(180deg, var(--white), var(--text-gray));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  position: relative;
}

.titulo-seccion::after {
  content: "";
  position: absolute;
  bottom: -10px;
  left: 50%;
  transform: translateX(-50%);
  width: 80px;
  height: 4px;
  background: #A2F0C5;
  border-radius: 2px;
}

.formulario-contacto {
  max-width: 800px;
  margin: 0 auto;
}

iframe {
  border: none;
  border-radius: 12px;
}
</style>
