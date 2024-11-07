import entitas.TodoList;
import repositories.TodoListRepository;
import repositories.TodoListRepositorylmpl;
import services.TodoListServices;
import services.TodoListServicelmpl;
import views.TodoListTerminalView;
import views.TodoListView;



public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositorylmpl();
        TodoListServices todoListService = new TodoListServicelmpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}