const { createApp } = Vue;

createApp({
  data() {
    return {
      clients: [],
      dolarOficial: []
    }
  },
  mounted() {
    const cantidadPesos = document.getElementById("cantidad-pesos");
    const tipoCambio = document.getElementById("tipo-cambio");
    const cantidadDolares = document.getElementById("cantidad-dolares");
    const formulario = document.getElementById("formulario");

    formulario.addEventListener("submit", (e) => {
      e.preventDefault();
      const cantidad = parseFloat(cantidadPesos.value);
      const cambio = parseFloat(tipoCambio.value);
      const resultado = cantidad * cambio;
      cantidadDolares.value = resultado.toFixed(2);
    });

    axios.get('http://localhost:8080/api/clients/1')
      .then(res => {
        this.clients = res.data;
        console.log(this.clients);
      })
      .catch(error => {
        console.error(error);
      });

    axios.get("https://www.dolarsi.com/api/api.php?type=valoresprincipales")
      .then(res => {
        this.dolarOficial = res.data[0].casa.compra;
        console.log(this.dolarOficial);
      })
      .catch(error => {
        console.error(error);
      });
  },
}).mount('#app');