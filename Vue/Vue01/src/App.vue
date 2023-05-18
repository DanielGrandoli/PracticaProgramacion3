<script setup>
  import { ref} from 'vue';

  var count = ref(0);
  var msg = ref("Hola Mariano!!!");

  function increment(){
    count.value++;
  }

  function decrement(){
    count.value--;
  }

  function cuadrado(){
    count.value = count.value * count.value;
  }

  function cubo(){
    count.value = count.value * count.value * count.value;
  }

  function sqrt2(){
    count.value = Math.pow(count.value,(1/2));
  }

  function sqrt3(){
    count.value = Math.pow(count.value,(1/3));
  }
</script>

<template>
  <h1>¡Hola Mundo!</h1>

  <div>
    <input type="text" name="texto" :value="msg"
        @input="event => msg = event.target.value">
    <h2><span>Message: {{ msg }}</span></h2>
  </div>

  <div>
    <h3>Count is: {{ count }}</h3>
  </div>
  <div>
    <button @click="increment">(+)</button> 
    <button @click="decrement">(-)</button>
    <button @click="cuadrado">(^2)</button>
    <button @click="cubo">(^3)</button>
    <button @click="sqrt2">(^-2)</button>
    <button @click="sqrt3">(^-3)</button>
  </div>
</template>

<style scoped>
  h1{
    color:chocolate;
  }
</style>