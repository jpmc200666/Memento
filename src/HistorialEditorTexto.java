import java.util.Stack;

public class HistorialEditorTexto {
    private Stack<EditorDeTextoMemento> historial =  new Stack<>();

    public void guardar(EditorDeTexto editor){
        historial.push(editor.guardar());
    }

    public void deshacer(EditorDeTexto editor) {
        if (!historial.isEmpty()) {
            editor.restaurar(historial.pop());
        } else {
            System.out.println("No hay más estados para restaurar.");
        }
    }
}