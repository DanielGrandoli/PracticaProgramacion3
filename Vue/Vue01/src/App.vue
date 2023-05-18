<script setup>
  import { ref} from 'vue';

  var count = ref(0);

  function increment(){
    count.value++;
  }

  function decrement(){
    count.value--;
  }
  function cuadrado(){
    count.value=count.value*count.value;
  }
  
  function cubo(){
    count.value=count.value*count.value*count.value;
  }
</script>

<template>
  <h1>¡Hola Mundo!</h1>
  <div>
    <h3>Count is: {{ count }}</h3>
  </div>
  <div>
    <button @click="increment">(+)</button> 
    <button @click="decrement">(-)</button>
    <button @click="cuadrado">(^2)</button> 
    <button @click="cubo">(^3)</button>

  </div>
</template>

<style scoped>
  h1{
    color:chocolate;
  }
</style>