<template>
  <nav class="barra-nav" id="barra-nav">
    <div class="contenedor-nav">
      <a href="#inicio" class="logo">
  <img src="/assets/images/utn.png" alt="UTN Logo">
      </a>
      <ul class="menu-nav">
        <li><a href="#inicio">Inicio</a></li>
        <li><a href="#sobre-nosotros">Sobre Nosotros</a></li>
        <li><a href="#proyectos">Proyectos</a></li>
        <li><a href="#estudios">Nuestros Estudios</a></li>
        <li><a href="#experiencia">Experiencia</a></li>
      </ul>
    </div>
  </nav>
</template>

<style scoped>
.barra-nav {
  position: fixed;
  top: 0;
  width: 100%;
  background: rgba(255, 255, 255, 0.95);
  backdrop-filter: blur(10px);
  padding: 1rem 0;
  z-index: 1000;
  transition: all 0.3s ease;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.contenedor-nav {
  max-width: 1200px;
  margin: 0 auto;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 2rem;
  max-height: 50px;
}

.logo {
  text-decoration: none;
  display: flex;
  align-items: center;
}

.logo img {
  height: 85px;
  width: auto;
  border-radius: 4px;
}

.menu-nav {
  display: flex;
  list-style: none;
  gap: 2rem;
}

.menu-nav a {
  color: #333;
  text-decoration: none;
  font-weight: 500;
  transition: all 0.3s ease;
  position: relative;
}

@media (max-width: 768px) {
  .barra-nav {
    padding: 0.5rem 0;
  }
  
  .contenedor-nav {
    max-height: 90px;
    padding: 0 1rem;
  }
  
  .logo img {
    height: 42px;
    filter: brightness(1.3) contrast(1.2);
    box-shadow: 0 0 8px rgba(162, 240, 197, 0.4);
  }
  
  .menu-nav {
    display: none;
  }
}

@media (max-width: 600px) {
  .logo img {
    height: 38px;
    filter: brightness(1.4) contrast(1.2);
    box-shadow: 0 0 6px rgba(162, 240, 197, 0.5);
  }
  
  .barra-nav {
    padding: 0.3rem 0;
  }
  
  .contenedor-nav {
    max-height: 80px;
  }
}

@media (max-width: 500px) {
  .logo img {
    height: 34px;
    filter: brightness(1.5) contrast(1.3);
    box-shadow: 0 0 5px rgba(162, 240, 197, 0.6);
  }
  
  .barra-nav {
    padding: 0.2rem 0;
  }
  
  .contenedor-nav {
    max-height: 70px;
    padding: 0 0.5rem;
  }
}
</style>
