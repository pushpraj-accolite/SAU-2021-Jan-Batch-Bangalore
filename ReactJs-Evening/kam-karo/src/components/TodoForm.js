import { Button, TextField } from "@material-ui/core";
import React, { useState} from "react";
import {v4 as uuid} from 'uuid'

function TodoForm({ addTodo }) {
  const [todo, setTodo] = useState({
    id: "",
    task: "",
    completed: false
  });

  function handleTaskInputChange(e) {
    setTodo({ ...todo, task: e.target.value });
  }

  function handleSubmit(e) {
    e.preventDefault(); 
    if (todo.task.trim()) {
      addTodo({ ...todo, id: uuid() });
      setTodo({ ...todo, task: "" });
    }
  }

  return (
    <form className="todo-form" onSubmit={handleSubmit}>
      <TextField
        style={{
            borderColor: "#282c34",
            color: "#282c34",
        }}
        label="Add task"
        type="text"
        name="task"
        value={todo.task}
        onChange={handleTaskInputChange}
      />
      <Button
       style={{
           marginTop:10,
           marginLeft: 10,
           color: "white"
       }}
        variant="contained"
        color="primary"
        type="submit"

      >
        <span>ADD</span>
      </Button>
    </form>
  );
}

export default TodoForm;