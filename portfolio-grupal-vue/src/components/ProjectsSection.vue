<template>
  <section id="proyectos" class="seccion proyectos">
    <h2 class="titulo-seccion">Nuestros Proyectos</h2>
    <div class="timeline">
      <div 
        v-for="project in projects" 
        :key="project.id" 
        class="timeline-item"
        :class="project.position"
      >
        <div class="proyecto-align-center">
          <div class="timeline-content bg-python-js">
            <h3 class="titulo-proyecto">{{ project.title }}</h3>
            <img 
              :src="project.image" 
              :alt="project.title" 
              class="img-proyecto"
              :class="{ 'margen-pequeno': project.smallMargin }"
            />
            <a :href="project.link" class="boton-ver-mas" target="_blank">Ver más</a>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
import { projects } from '../data/projects'
</script>

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

.timeline {
  position: relative;
  max-width: 1200px;
  margin: 0 auto;
  padding: 3rem 0 2rem 0;
}

.timeline::before {
  content: '';
  position: absolute;
  top: 0;
  left: 50%;
  transform: translateX(-50%);
  width: 4px;
  height: 100%;
  background: #A2F0C5;
  z-index: 1;
}

.timeline-item {
  position: relative;
  width: 50%;
  padding: 2rem 2.5rem;
  box-sizing: border-box;
  margin-bottom: 2rem;
}

.timeline-item.left {
  left: 0;
  text-align: right;
}

.timeline-item.right {
  left: 50%;
  text-align: left;
}

.timeline-content {
  background: none;
  border-radius: 18px;
  box-shadow: none;
  padding: 2rem 2rem 1.5rem 2rem;
  position: relative;
  z-index: 2;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  min-width: 320px;
  max-width: 420px;
  transition: none;
}

.timeline-item.left .timeline-content {
  margin-left: auto;
}

.timeline-item.right .timeline-content {
  margin-right: auto;
}

.timeline-item::after {
  content: '';
  position: absolute;
  top: 2.5rem;
  width: 18px;
  height: 18px;
  background: #181c23;
  border: 4px solid #A2F0C5;
  border-radius: 50%;
  z-index: 3;
}

.timeline-item.left::after {
  right: -9px;
}

.timeline-item.right::after {
  left: -9px;
}

.titulo-proyecto {
  font-family: 'Nunito', Arial, sans-serif;
  font-weight: 800;
  font-size: 1.3rem;
  color: #A2F0C5;
  text-align: center;
  margin-bottom: 1.5rem;
}

.proyecto-align-center {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  max-width: 420px;
  margin-left: auto;
  margin-right: auto;
}

.bg-python-js {
  min-height: 220px;
  height: auto;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border-radius: 18px;
  padding-bottom: 1.5rem;
  position: relative;
  box-shadow: none;
}

.img-proyecto {
  display: block;
  margin: 0 auto -2.8rem auto;
  max-width: 400px;
  max-height: 260px;
  width: auto;
  height: auto;
}

.img-proyecto.margen-pequeno {
  margin-bottom: 0.2rem;
}

.boton-ver-mas {
  display: block;
  width: fit-content;
  margin: 1rem auto 0;
  padding: 0.8rem 1.5rem;
  background: #23272f;
  color: white;
  text-decoration: none;
  border: 2px solid white;
  border-radius: 25px;
  font-weight: 600;
  font-size: 0.95rem;
  transition: all 0.3s ease;
  text-align: center;
}

.boton-ver-mas:hover {
  background: #A2F0C5;
  color: #111;
  transform: translateY(-2px);
}

@media (max-width: 900px) {
  .timeline::before {
    left: 20px;
    transform: none;
  }
  
  .timeline-item,
  .timeline-item.left,
  .timeline-item.right {
    width: 100%;
    left: 0;
    text-align: left;
    padding-left: 50px;
    padding-right: 1rem;
  }
  
  .timeline-item.left .timeline-content,
  .timeline-item.right .timeline-content {
    margin: 0;
    min-width: unset;
    width: 100%;
    max-width: 100%;
  }
  
  .timeline-item::after {
    left: 11px;
    right: auto;
  }
  
  .timeline-content {
    min-width: unset;
    width: 100%;
  }
}
</style>
