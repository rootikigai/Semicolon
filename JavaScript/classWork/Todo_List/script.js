const taskList = document.querySelector('.task-list ul');
const addTaskForm = document.querySelector('.add-task');

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

addTaskForm.addEventListener('submit', function (event) {
    event.preventDefault();
    const value = addTaskForm.querySelector('input[type="text"]').value.trim();
});

taskList.addEventListener('click', function (event) {
    if (event.target.classList.contains('delete')) {
        let li = event.target.closest('li');
        let taskName = li.querySelector('.name').textContent;
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
