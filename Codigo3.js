async function buscarDados() {
  const res = await fetch("https://jsonplaceholder.typicode.com/posts/1");
  const data = await res.json();
  return data;
}

async function main() {
  const resultado = await buscarDados();
  console.log(resultado.title);
}

main();
