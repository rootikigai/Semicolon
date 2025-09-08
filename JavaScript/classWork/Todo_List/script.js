const taskList = document.querySelector('.task-list ul');
const addTaskForm = document.querySelector('.add-task');

function getTasksFromStorage() {
    return JSON.parse(localStorage.getItem('tasks')) || [];
}

function saveTasksToStorage(tasks) {
    localStorage.setItem('tasks', JSON.stringify(tasks));
}

function renderTasks() {
    taskList.innerHTML = '';
    const tasks = getTasksFromStorage();
    tasks.forEach(task => {
        createNewElements(task.name, task.completed);
    });
}

function createNewElements(value, completed = false) {
    let li = document.createElement('li');

    let checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    checkbox.classList.add('todo-checkbox');
    checkbox.checked = completed;

    let taskName = document.createElement('span');
    taskName.textContent = value;
    taskName.classList.add('name');
    if (completed) {
        taskName.classList.add('completed');
    }

    let deleteBtn = document.createElement('span');
    deleteBtn.textContent = 'delete';
    deleteBtn.classList.add('delete');

    li.appendChild(checkbox);
    li.appendChild(taskName);
    li.appendChild(deleteBtn);
    taskList.appendChild(li);
}

renderTasks();

addTaskForm.addEventListener('submit', function (event) {
    event.preventDefault();
    const value = addTaskForm.querySelector('input[type="text"]').value.trim();

    if (value !== "") {
        const tasks = getTasksFromStorage();
        tasks.push({ name: value, completed: false });
        saveTasksToStorage(tasks);

        renderTasks();
        addTaskForm.reset();
    }
    else {
        alert("Get sense na! Enter task abeg...");
    }
});

taskList.addEventListener('click', function (event) {
    if (event.target.classList.contains('delete')) {
        let li = event.target.closest('li');
        let taskName = li.querySelector('.name').textContent;

        let tasks = getTasksFromStorage();
        tasks = tasks.filter(task => task.name !== taskName);
        saveTasksToStorage(tasks);

        renderTasks();
    }
});

taskList.addEventListener('change', function (event) {
    if (event.target.classList.contains('todo-checkbox')) {
        const li = event.target.closest('li');
        const taskNameSpan = li.querySelector('.name');
        const taskName = taskNameSpan.textContent;

        let tasks = getTasksFromStorage();
        tasks = tasks.map(task => {
            if (task.name === taskName) {
                task.completed = event.target.checked;
            }
            return task;
        });

        saveTasksToStorage(tasks);

        if (event.target.checked) {
            taskNameSpan.classList.add('completed');
        } else {
            taskNameSpan.classList.remove('completed');
        }
    }
});

const searchBar = document.forms['search-tasks'].querySelector('input');
searchBar.addEventListener('keyup', function (event) {
    const term = event.target.value.toLowerCase();
    const tasks = taskList.getElementsByTagName('li');
    Array.from(tasks).forEach(function (task) {
        const title = task.querySelector('.name').textContent;
        if (title.toLowerCase().indexOf(term) != -1) {
            task.style.display = 'block';
        }
        else {
            task.style.display = 'none';
        }
    });
});
