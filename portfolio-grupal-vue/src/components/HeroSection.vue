<template>
  <section id="inicio" class="heroe">
    <div class="contenido-heroe">
      <div class="texto-heroe">
        <h1>ALT+F4</h1>
        <p class="descripcion">Grupo de trabajo de 5 integrantes cursando la Tecnicatura en Programación de la UTN San Rafael</p>
      </div>
      <div class="imagen-heroe">
  <img src="/assets/images/altf4.png" alt="ALT+F4 Team Member">
      </div>
    </div>
  </section>
</template>

<style scoped>
.heroe {
  height: 60vh;
  background: #0c0c0c;
  display: flex;
  align-items: center;
  justify-content: center;
  color: white;
  position: relative;
  overflow: hidden;
  border-bottom: 2px solid rgba(162, 240, 197, 0.3);
}

.contenido-heroe {
  position: relative;
  z-index: 2;
  max-width: 1200px;
  padding: 0 2rem;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 2rem;
}

.texto-heroe {
  flex: 1;
  text-align: left;
  max-width: 600px;
}

.imagen-heroe {
  flex: 1;
  display: flex;
  justify-content: center;
  align-items: center;
}

.imagen-heroe img {
  max-width: 100%;
  height: auto;
}

.heroe h1 {
  font-size: 4rem;
  margin-bottom: 1rem;
  animation: aparecer 1s ease-out;
  background: linear-gradient(106deg, #7de5ba 9.18%, #b6ffff 91.98%);
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

.heroe .descripcion {
  font-size: 1.5rem;
  margin-bottom: 1rem;
  opacity: 0.9;
  animation: aparecer 1s ease-out 0.3s both;
  color: rgba(255, 255, 255, 0.9);
  background: linear-gradient(180deg, var(--white), var(--text-gray));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

@media (max-width: 768px) {
  .heroe {
    height: auto;
    min-height: 100vh;
    padding-top: 100px;
    padding-bottom: 3rem;
  }

  .contenido-heroe {
    flex-direction: column;
    text-align: center;
    justify-content: flex-start;
    height: auto;
    padding: 2rem 1rem;
    gap: 1rem;
  }

  .texto-heroe {
    text-align: center;
    flex: 0;
  }

  .heroe h1 {
    font-size: 2.5rem;
  }

  .heroe .descripcion {
    font-size: 1.2rem;
    color: rgba(255, 255, 255, 0.9);
  }

  .imagen-heroe {
    max-width: 50%;
    margin: 0 auto;
  }
}

@media (max-width: 600px) {
  .heroe {
    padding-top: 90px;
    padding-bottom: 3rem;
  }

  .contenido-heroe {
    padding: 1rem;
    gap: 1rem;
  }

  .heroe h1 {
    font-size: 2rem;
    margin-bottom: 1rem;
    line-height: 1.2;
  }

  .heroe .descripcion {
    font-size: 1rem;
    line-height: 1.4;
    color: rgba(255, 255, 255, 0.9) !important;
  }
}

@media (max-width: 500px) {
  .heroe {
    padding-top: 80px;
    padding-bottom: 2rem;
  }
  
  .contenido-heroe {
    padding: 0.5rem;
    gap: 0.8rem;
  }
  
  .heroe h1 {
    font-size: 1.8rem;
    margin-bottom: 0.8rem;
  }
  
  .heroe .descripcion {
    font-size: 0.9rem;
    line-height: 1.3;
  }
  
  .imagen-heroe {
    max-width: 60%;
  }
}
</style>
