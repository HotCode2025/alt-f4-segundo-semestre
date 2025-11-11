<template>
  <section id="sobre-nosotros" class="seccion">
    <h2 class="titulo-seccion">Sobre Nosotros</h2>
    <div class="contenido-sobre tarjetas-equipo">
      <div v-for="member in teamMembers" :key="member.id" class="tarjeta-miembro">
        <div class="circulo-perfil">
          <img 
            :src="member.image" 
            :alt="member.name" 
            :class="member.isLuz ? 'imagen-perfil-luz' : 'imagen-perfil'"
          >
        </div>
        <div class="info-miembro">
          <div class="nombre-miembro">{{ member.name }}</div>
          <div class="ubicacion-miembro">{{ member.location }}</div>
        </div>
        <div class="redes-miembro">
          <a :href="member.github" target="_blank" class="icono-social github" title="GitHub">
            <font-awesome-icon :icon="['fab', 'github']" />
          </a>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
import { teamMembers } from '../data/teamMembers'
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

.tarjetas-equipo {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 2.5rem;
  margin: 2rem 0 3rem 0;
}

.tarjeta-miembro {
  background: #242832;
  border-radius: 24px;
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 260px;
  min-width: 260px;
  max-width: 260px;
  min-height: 400px;
  height: 400px;
  padding: 2.5rem 1.2rem 2.5rem 1.2rem;
  position: relative;
  transition: transform 0.2s, box-shadow 0.2s;
  box-sizing: border-box;
  justify-content: space-between;
}

.tarjeta-miembro:hover {
  transform: translateY(-8px) scale(1.03);
}

.circulo-perfil {
  width: 180px;
  height: 180px;
  border-radius: 50%;
  background: #23272f;
  border: 5px solid #A2F0C5;
  margin-bottom: 1.2rem;
  display: flex;
  align-items: center;
  justify-content: center;
  box-shadow: 0 4px 16px rgba(162, 240, 197, 0.15);
  overflow: hidden;
  flex-shrink: 0;
}

.imagen-perfil {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 0.3s ease;
}

.imagen-perfil-luz {
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: top;
  transition: transform 0.3s ease;
}

.info-miembro {
  text-align: center;
  margin-bottom: 1.2rem;
  flex-grow: 0;
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

.nombre-miembro {
  font-family: 'Nunito', Arial, sans-serif;
  font-weight: 800;
  font-size: 1.3rem;
  background: linear-gradient(180deg, var(--white), var(--text-gray));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  letter-spacing: 1px;
}

.ubicacion-miembro {
  font-family: 'Nunito', Arial, sans-serif;
  font-size: 0.9rem;
  color: #8c98a4;
  font-style: italic;
}

.redes-miembro {
  display: flex;
  gap: 1.5rem;
  justify-content: center;
  margin-top: auto;
  width: 100%;
  position: absolute;
  bottom: -1rem;
  left: 0;
}

.icono-social {
  color: #fff;
  font-size: 1.5rem;
  background: #23272f;
  border-radius: 50%;
  width: 40px;
  height: 40px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: background 0.2s, color 0.2s, transform 0.2s;
  margin: 0 auto;
}

.icono-social.github:hover {
  background: #333;
  color: #fff;
  transform: scale(1.08);
}

@media (max-width: 1100px) {
  .tarjetas-equipo {
    gap: 1.2rem;
  }
  
  .tarjeta-miembro {
    width: 200px;
    min-width: 200px;
    max-width: 200px;
    min-height: 320px;
    height: 320px;
    padding: 1.5rem 0.5rem 1rem 0.5rem;
  }
  
  .circulo-perfil {
    width: 160px;
    height: 160px;
  }
}

@media (max-width: 700px) {
  .tarjetas-equipo {
    flex-direction: column;
    align-items: center;
    gap: 1.5rem;
  }
  
  .tarjeta-miembro {
    width: 90vw;
    min-width: unset;
    max-width: 350px;
  }
}

@media (max-width: 600px) {
  .tarjeta-miembro {
    width: 200px;
    min-width: 200px;
    max-width: 200px;
    min-height: 320px;
    height: 320px;
    padding: 1.5rem 0.5rem 1rem 0.5rem;
  }
  
  .circulo-perfil {
    width: 160px;
    height: 160px;
  }
}

@media (max-width: 500px) {
  .tarjeta-miembro {
    width: 90vw;
    max-width: 280px;
    min-width: unset;
    height: auto;
    min-height: 300px;
    padding: 1rem 0.8rem 2rem 0.8rem;
  }
  
  .circulo-perfil {
    width: 140px;
    height: 140px;
  }
  
  .nombre-miembro {
    font-size: 1.1rem;
  }
  
  .ubicacion-miembro {
    font-size: 0.8rem;
  }
}
</style>
