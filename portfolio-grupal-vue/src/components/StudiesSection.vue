<template>
  <section id="estudios" class="seccion">
    <h2 class="titulo-seccion">Nuestros Estudios</h2>
    <div class="lista-estudios">
      <div class="estudio-item">
        <span class="estudio-año">{{ studies.year }}</span>
        <h3>{{ studies.title }}</h3>
        <p>{{ studies.institution }}</p>
        <ul class="tecnologias">
          <li v-for="tech in studies.technologies" :key="tech">{{ tech }}</li>
        </ul>
      </div>
    </div>
  </section>
</template>

<script setup>
import { studies } from '../data/studies'
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

.lista-estudios {
  max-width: 1200px;
  margin: 0 auto;
  display: grid;
  grid-template-columns: 1fr;
  gap: 2rem;
}

.estudio-item {
  background: #242832;
  border-radius: 15px;
  padding: 2rem;
  position: relative;
  border-left: 4px solid #A2F0C5;
  height: 100%;
  max-width: 600px;
  margin: 0 auto;
}

.estudio-año {
  position: absolute;
  top: 1rem;
  right: 1rem;
  background: #A2F0C5;
  color: #1a1a1a;
  padding: 0.5rem 1rem;
  border-radius: 20px;
  font-weight: bold;
  font-size: 0.9rem;
}

.estudio-item h3 {
  font-size: 1.5rem;
  margin-bottom: 0.5rem;
  background: linear-gradient(180deg, var(--white), var(--text-gray));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

.estudio-item p {
  color: #b0bec5;
  margin-bottom: 1rem;
}

.tecnologias {
  display: flex;
  flex-wrap: wrap;
  gap: 0.5rem;
  list-style: none;
  padding: 0;
}

.tecnologias li {
  background: #23272f;
  color: #A2F0C5;
  padding: 0.5rem 1rem;
  border-radius: 15px;
  font-size: 0.9rem;
  border: 1px solid #A2F0C5;
  white-space: nowrap;
  margin-bottom: 0.5rem;
}

.estudio-item:hover {
  transform: translateY(-5px);
  transition: transform 0.3s ease;
}

@media (max-width: 768px) {
  .lista-estudios {
    padding: 0 1rem;
  }
}

@media (max-width: 600px) {
  .estudio-año {
    top: 0.3rem;
    padding: 0.5rem 0.9rem;
    font-size: 0.8rem;
  }
}

@media (max-width: 500px) {
  .estudio-item {
    padding: 1.5rem 1rem 2rem 1rem;
    margin-bottom: 1rem;
  }
  
  .estudio-año {
    position: relative;
    top: auto;
    right: auto;
    margin-bottom: 1rem;
    display: inline-block;
    font-size: 0.7rem;
    padding: 0.3rem 0.8rem;
  }
  
  .estudio-item h3 {
    font-size: 1.2rem;
    margin-top: 0.5rem;
  }
  
  .estudio-item p {
    font-size: 0.9rem;
  }
  
  .tecnologias li {
    font-size: 0.8rem;
    padding: 0.3rem 0.8rem;
  }
}
</style>
