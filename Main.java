import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDblmpl;
import services.TodoListServices;
import services.TodoListServicelmpl;
import views.TodoListTerminalViewlmpl;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {

        Database database = new Database("todo_si", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDblmpl(database);
        TodoListServices todoListService = new TodoListServicelmpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalViewlmpl(todoListService);
        todoListView.run();
    }
}