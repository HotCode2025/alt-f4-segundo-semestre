<template>
  <div id="app">
    <NavBar />
    <HeroSection />
    <AboutSection />
    <ProjectsSection />
    <StudiesSection />
    <ExperienceSection />
    <ContactSection />
    <Footer />
  </div>
</template>

<script setup>
import NavBar from './components/layout/NavBar.vue'
import HeroSection from './components/HeroSection.vue'
import AboutSection from './components/AboutSection.vue'
import ProjectsSection from './components/ProjectsSection.vue'
import StudiesSection from './components/StudiesSection.vue'
import ExperienceSection from './components/ExperienceSection.vue'
import ContactSection from './components/ContactSection.vue'
import Footer from './components/layout/Footer.vue'
</script>

<style>
#app {
  font-family: 'Nunito', Arial, sans-serif;
}
</style>
