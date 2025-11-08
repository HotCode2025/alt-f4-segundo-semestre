// Función que crea un gestor de tareas simple
function createTaskManager() {
  let tasks = []; // Array interno (encapsulado)

  return {
    // Agregar una nueva tarea
    addTask: function (task) {
      const newTask = {
        id: tasks.length + 1,
        name: task,
        completed: false
      };
      tasks.push(newTask);
      console.log(`🆕 Tarea agregada: ${task}`);
    },

    // Marcar una tarea como completada
    completeTask: function (taskId) {
      const task = tasks.find(t => t.id === taskId);
      if (task) {
        task.completed = true;
        console.log(`✅ Tarea completada: ${task.name}`);
      } else {
        console.log(`⚠️ Tarea con ID ${taskId} no encontrada.`);
      }
    },

    // Listar todas las tareas
    listTasks: function () {
      console.log("📋 Lista de tareas:");
      tasks.forEach(t => {
        const status = t.completed ? "✔️" : "❌";
        console.log(`${t.id}. ${t.name} - ${status}`);
      });
    }
  };
}

// Uso del gestor
const myTasks = createTaskManager();
myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");
myTasks.listTasks();
myTasks.completeTask(1);
myTasks.listTasks();
