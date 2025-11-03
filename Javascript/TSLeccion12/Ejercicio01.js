// Función que valida una contraseña segura
// Requisitos: mínimo 8 caracteres, al menos una mayúscula y un número

function validatePassword(password) {
  // Expresión regular:
  // ^ inicio / $ fin / (?=.*[A-Z]) al menos una mayúscula
  // (?=.*\d) al menos un número / .{8,} al menos 8 caracteres
  const regex = /^(?=.*[A-Z])(?=.*\d).{8,}$/;

  // Testea la contraseña con la expresión
  return regex.test(password);
}

// Pruebas
console.log(validatePassword("Abc12345")); // true 
console.log(validatePassword("weak"));      // false 
console.log(validatePassword("Strong1"));   // false (menos de 8)
console.log(validatePassword("Password99")); // true 
